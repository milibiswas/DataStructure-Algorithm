package FirstPackage;
import java.util.*;

public class MergeSort {
	
	public ArrayList<Integer>  mrgeSort(ArrayList<Integer> aList )
	{
		int size = aList.size();
		if(size==1)
		{
			return aList;
		}
		if (size>1)
		{
			ArrayList<Integer> aList1 = new ArrayList<Integer>(aList.subList(0, size/2));
			ArrayList<Integer> aList3=  mrgeSort(aList1);
			ArrayList<Integer> aList2 = new ArrayList<Integer>(aList.subList(size/2, size));
			ArrayList<Integer> aList4=  mrgeSort(aList2);
			aList=this.merge(aList3, aList4);
		}
		
		//ArrayList<Integer> aList5 = merge(aList3,aList4);
        return aList;
	}
	public ArrayList<Integer> merge(ArrayList<Integer> aList1,ArrayList<Integer> aList2) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		
		int size1  = aList1.size();
		int size2 = aList2.size();
		
		int i = 0,j=0;
		while((i<size1) && (j<size2)) {
			
			if(aList1.get(i) > aList2.get(j)) {
				aList.add(aList2.get(j));
				j++;
			}else {
				
				aList.add(aList1.get(i));
				i++;
			}
			
		}
		
		if(i<size1) {
			aList.addAll(aList1.subList(i, size1));
		}
		
		if(j<size2) {
			aList.addAll(aList2.subList(j, size2));
		}
		
		return aList;
	}
	
	public static void main(String args[])
	{
		MergeSort obj1 = new MergeSort();
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(5);
		aList.add(12);
		aList.add(2);
		aList.add(1);
		aList.add(3);
		aList.add(120);
		aList.add(25);
		aList.add(11);
		aList.add(15);
		aList.add(16);
		aList.add(27);
		aList.add(145);
		aList.add(-5);
		aList.add(167);
		aList.add(-30);
		ArrayList<Integer> aList1 = new ArrayList<Integer>();
		aList1=obj1.mrgeSort(aList);
		
		for(int i : aList1)
			System.out.println(i);
		
	}

}
