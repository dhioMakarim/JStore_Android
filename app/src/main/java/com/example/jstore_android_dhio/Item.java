package com.example.jstore_android_dhio;

public class Item {
    private int id;
    private String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    /**
     * Constructor for objects of class Item
     */
    public Item(int id, String name, int price, String category,
                String status, Supplier supplier)
    {
        //this.id = DatabaseItem.getLastItemID() + 1;
        this.id = id;
        this.price = price;
        this.status = status;
        this.name = name;
        this.category = category;
        this.supplier = supplier;
    }

    /**
     * get item's id
     * @return      item's id
     */
    public int getId() {
        return id;
    }

    /**
     * set item's id
     * @param   id   item's id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * get item's name
     * @return      item's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * set item's name
     * @param   name    item's name
     */
    public void setName(String name)
    {
        this.name = name;
    }


    public int getPrice()
    {
        return price;
    }

    /**
     * set price of the item
     * @param   price    price of the item
     */
    public void setPrice(int price)
    {
        this.price = price;
    }

    /**
     * get item's category name
     * @return      item's category name
     */
    public String getCategory()
    {
        return category;
    }

    /**
     * set item category
     * @param   category    category of the item
     */
    public void setCategory(String category)
    {
        this.category = category;
    }

    /**
     * get supplier object
     * @param   supplier    supplier from the Supplier object
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }

    /**
     * set item's supplier
     * @return      item's supplier object
     */
    public Supplier getSupplier()
    {
        return supplier;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * set item's supplier
     * @return      item's supplier object
     */
    public String getStatus()
    {
        return status;
    }
}
