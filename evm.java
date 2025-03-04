import java.util.Scanner;
class evm
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int population;
	    int bjp =0, cong = 0, aap = 0, ss = 0, mns = 0, nota = 0;

	    System.out.println();
	    System.out.println("       welcome       ");
	    System.out.println();

	    System.out.println("enter number of population : ");
	    population = sc.nextInt();

	    for(int i=1; i<=population; i++)
	    {
	    	System.out.println();
	    	System.out.println("     LIST OF CANDIDATES     ");
	    	System.out.println("BJP");
	    	System.out.println("CONGRESS");
	    	System.out.println("AAP");
	    	System.out.println("SHIV SENA");
	    	System.out.println("MNS");
	    	System.out.println("NOTA");
	    	System.out.println();

	    	System.out.println("enter your option : ");
	    	int opt = sc.nextInt();
              
             if (opt >=1 && opt<= 6)
              {
             	if(opt ==1)
             	{
             		bjp++;
             		System.out.println("vote goes to BJP");
             	}

             	if(opt ==2)
             	{
             		cong++;
             		System.out.println("vote goes to CONGRESS");
             	}

             	if(opt ==3)
             	{
             		aap++;
             		System.out.println("vote goes to AAP");
             	}

             	if(opt ==4)
             	{
             		ss++;
             		System.out.println("vote goes to SHIV SENA");
             	}

             	if(opt ==5)
             	{
             		mns++;
             		System.out.println("vote goes to MNS");
             	}

             	if(opt ==6)
             	{
             		nota++;
             		System.out.println("vote goes to NOTA");
             	}


             }


	    	if(!(opt >=1 && opt<= 6))
	    	{
	    		i--;
	    		System.out.println("INVALID OPTION");
	    	}

	    }
	    System.out.println(bjp);
	    System.out.println(cong);
	    System.out.println(aap);
	    System.out.println(ss);
	    System.out.println(mns);
	    System.out.println(nota);
        
        if (bjp>=cong && bjp>=aap && bjp>=ss && bjp>=mns && bjp>=nota)
        {
        	System.out.println("BJP has won the election by " +bjp +" votes ");
        }
        if (cong>=bjp && cong>=aap && cong>=ss && cong>=mns && cong>=nota)
        {
        	System.out.println("CONGRESS has won the election by " +cong +" votes ");
        }
        if (aap>=cong && aap>=bjp && aap>=ss && aap>=mns && aap>=nota)
        {
        	System.out.println("AAP has won the election by " +aap +" votes ");
        }
        if (ss>=cong && ss>=aap && ss>=bjp && ss>=mns && ss>=nota)
        {
        	System.out.println("SHIVSENA has won the election by " +ss +" votes ");
        }
        if (mns>=cong && mns>=aap && mns>=ss && mns>=bjp && mns>=nota)
        {
        	System.out.println("MNS has won the election by " + mns +" votes ");
        }
        if (nota>=cong && nota>=aap && nota>=ss && nota>=mns && nota>=bjp)
        {
        	System.out.println("No one has won the election ");
        }

	}
}