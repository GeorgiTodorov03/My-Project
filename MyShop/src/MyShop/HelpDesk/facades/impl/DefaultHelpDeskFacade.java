package MyShop.HelpDesk.facades.impl;

import MyShop.HelpDesk.enteties.SupportTicket;
import MyShop.HelpDesk.facades.HelpDeskFacade;
import MyShop.HelpDesk.utils.CustomSupportTicketsComparator;

import java.util.PriorityQueue;
import java.util.Queue;

public class DefaultHelpDeskFacade implements HelpDeskFacade {

    private Queue<SupportTicket> tickets;

    {
        tickets = new PriorityQueue<>(new CustomSupportTicketsComparator());
    }

    @Override
    public void addNewSupportTicket(SupportTicket supportTicket) {
        tickets.offer(supportTicket);
    }

    @Override
    public SupportTicket getNextSupportTicket() {
        return tickets.poll();
    }

    @Override
    public int getNumberOfTickets() {
        return tickets.size();
    }
}
