package com.neosoft.housieticket;
public class HousieTicketGenerator {
	public static void main(String[] args) 
	{
		
        Ticket t = new Ticket(3, 9);
        t.genrateTicket();
        t.showTicket();

	}

}


class Ticket {
    private int row;
    private int column;

    int[][] ticket;
    int[] columns = new int[9];

    Ticket(int r, int c)
    {
        this.row = r;
        this.column = c;
        ticket = new int[row][column];
    }
    
    public int randomNumber(int low, int high)
    {
        int random = (int) (Math.random() * (high - low + 1) + low);
        return random;
    }

    public void genrateTicket()
    {
        int count = 0;
        while (count <= 4) 
        {
            int index = randomNumber(0, 8);

            if (ticket[0][index] == 0)
            {
                int value = randomNumber((index * 10) + 1, (index * 10) + 10);
                ticket[0][index] = value;

                ++columns[index];
                ++count;
            }
        }

        count = 0;

        
        while (count <=4) 
        {
            int index = randomNumber(0, 8);

            if (ticket[1][index] == 0 && columns[index] < 2) 
            {
                int value = randomNumber((index * 10) + 1, (index * 10) + 10);
                if (value != ticket[0][index]) 
                {
                    ticket[1][index] = value;
                    ++columns[index];
                    ++count;
                }
            }
        }
        
        count = 0;

        
        while (count <= 4) 
        {
            int index = randomNumber(0, 8);

            if (ticket[2][index] == 0 && columns[index] < 2) 
            {
                int value = randomNumber((index * 10) + 1, (index * 10) + 10);
                if((value != ticket[0][index]) && (value != ticket[1][index]))
                {
                    ticket[2][index] = value;
                    ++columns[index];
                    ++count;
                }
            }
        }
    }
  
    
    public void showTicket()
    {
    	System.out.println("\t\tHousie Ticket Generate\n");
        for(int i=0; i<row; ++i)
        {
            for(int j=0; j<column; ++j)
            {
                if (ticket[i][j] == 0)
                    System.out.print("_ ");
                else
                    System.out.print(ticket[i][j] + " ");
            }
            System.out.println();
        }
    }

}
