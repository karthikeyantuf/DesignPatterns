package StateDesignPattern;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Inventory {
    Queue<Integer> availableAsiles;
    HashMap<Integer,Product> asileNumberVsProduct;
    HashMap<Integer,Integer> productIdVsCount;

    public Inventory(int asileCount)
    {
        availableAsiles = new LinkedList<>();
        for(int i=1;i<=asileCount;i++)
        {
            availableAsiles.add(i);
        }
        asileNumberVsProduct = new HashMap<>();
        productIdVsCount = new HashMap<>();
    }

    public void addProduct(Product product) throws Exception
    {
        int id = product.getProductId();
        int count = productIdVsCount.getOrDefault(id,0);

        if(count == 0)
        {
            if(availableAsiles.isEmpty())
            {
                throw new Exception("Asiles got over,No more product can be added");
            }
            asileNumberVsProduct.put(availableAsiles.poll(),product);
        }
        productIdVsCount.put(id,count+1);
    }

    public Product getProduct(int aisleNumber)
    {
        return asileNumberVsProduct.get(aisleNumber);
    }

    public boolean checkIfProductAvailable(int prodId)
    {
        int count = productIdVsCount.getOrDefault(prodId,0);
        return count > 0;
    }

    public void deductProductCount(int aisleNumber)
    {
        int productId = asileNumberVsProduct.get(aisleNumber).getProductId();
        int updatedCount = productIdVsCount.get(aisleNumber) - 1;

        if(updatedCount == 0)
        {
            productIdVsCount.remove(productId);
            asileNumberVsProduct.remove(aisleNumber);
            availableAsiles.add(aisleNumber);
        }
        else
        {
            productIdVsCount.put(productId,updatedCount);
        }
    }
}
