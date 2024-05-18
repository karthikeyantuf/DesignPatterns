import java.util.LinkedList;
import java.util.Queue;

public class Linked {

//    public int getTheTargetAnswer(LinkedList head)
//    {
//        Queue<Integer> q = new LinkedList<>();   5
//        LinkedList temp = head;
//        while(temp != null)
//        {
//            if(q.size() == 5) q.pop();
//            q.push(head.data);
//            head=head.next;
//        }
//
//        return q.peek();
//    }
//
//
//    public void zigzag()
//    {
//
//
//    }
    public static void main(String args)
    {

        int num = 1;

        int[][] arr = new int[4][5];

        for(int col=0;col<=4;col++)
        {
            if(col %2 == 0)
            {
                for(int row=0;row<4;row++)
                {
                    arr[col][row] = num++;
                }
            }
            else {
                for(int row=3;row>=0;row--)
                {
                    arr[col][row] = num++;
                }
            }
        }

        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.println(arr[i][j]);
            }
        }


    }

}





