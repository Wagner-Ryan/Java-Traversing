import java.util.ArrayList;
/**
 * Ryan Wagner
 * 2/23/2021
 * Traverse through arrays
 */
public class ElectionTesterV2
{
    public static void main(String[] args){
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Tony Stark", 3000));
        candidates.add(new Candidate("Steve Rogers", 99));
        candidates.add(new Candidate("Thor Odinson", 1500));
        candidates.add(new Candidate("Bruce Banner", 1000));
        candidates.add(new Candidate("Clint Barton", 48));
        
        int totalVotes = 0;
        for(Candidate c: candidates){
            totalVotes += c.getVotes();
        }
        
        System.out.printf("%20s \n \n", "Raw Election Data:");
        for(Candidate c: candidates){
            System.out.println(c.getName() + " recieved " + c.getVotes() + " votes.");
        }
        System.out.println("\n" + "\n" + "Election Results:");
        System.out.printf("\n %30s %20s", "Votes", "% of Total");
        System.out.printf("\n %9s %22s %15s", "Candidate", "Recieved", "Votes");
        System.out.println("\n" + "====================================================");
        System.out.printf("%s %20s %17s \n", candidates.get(0).getName(), candidates.get(0).getVotes(), percentOfVotes(totalVotes, candidates.get(0).getVotes()));
        for(int i = 1; i < candidates.size(); i++){
            System.out.printf("%s %18s %17s \n", candidates.get(i).getName(), candidates.get(i).getVotes(), percentOfVotes(totalVotes, candidates.get(i).getVotes()));
        }
    }
    
    public static double percentOfVotes(int totalVotes, int votes){
        double tVotes = totalVotes, v = votes;
        double percentOfVotes = Math.round((v / tVotes) * 1000) / 10.0;
        return percentOfVotes;
    }
}
