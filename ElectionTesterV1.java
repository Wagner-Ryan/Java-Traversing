/**
 * Ryan Wagner
 * 2/23/2021
 * Traverse through arrays
 */
public class ElectionTesterV1
{
    public static void main(String[] args){
        
        Candidate[] candidates = new Candidate[5];
        
        candidates[0] = new Candidate("Tony Stark", 3000);
        candidates[1] = new Candidate("Steve Rogers", 99);
        candidates[2] = new Candidate("Thor Odinson", 1500);
        candidates[3] = new Candidate("Bruce Banner", 1000);
        candidates[4] = new Candidate("Clint Barton", 48);
        
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
        System.out.printf("%s %20s %17s \n", candidates[0].getName(), candidates[0].getVotes(), percentOfVotes(totalVotes, candidates[0].getVotes()));
        for(int i = 1; i < candidates.length; i++){
            System.out.printf("%s %18s %17s \n", candidates[i].getName(), candidates[i].getVotes(), percentOfVotes(totalVotes, candidates[i].getVotes()));
        }
    }
    
    public static double percentOfVotes(int totalVotes, int votes){
        double tVotes = totalVotes, v = votes;
        double percentOfVotes = Math.round((v / tVotes) * 1000) / 10.0;
        return percentOfVotes;
    }
}
