
//Write the required business logic as expected in the question description

public class Query {
    private String queryId;
    private String queryCategory;
    private DataSet primaryDataSet;
    private DataSet secondaryDataSet;
    
    @Override
    public String toString()
    {
        String g="";
        g+=("Primary data set"+"\n");
        g+=("Theatre id : "+primaryDataSet.getTheatreId()+"\n");
        g+=("Theatre name : "+primaryDataSet.getTheatreName()+"\n");
        g+=("Location :"+primaryDataSet.getLocation()+"\n");
        g+=("No of Screen : "+primaryDataSet.getNoOfScreen()+"\n");
        g+=("Ticket Cost : "+primaryDataSet.getTicketCost()+"\n");
        
        g+=("Secondary data set"+"\n");
        g+=("Theatre id : "+secondaryDataSet.getTheatreId()+"\n");
        g+=("Theatre name : "+secondaryDataSet.getTheatreName()+"\n");
        g+=("Location :"+secondaryDataSet.getLocation()+"\n");
        g+=("No of Screen : "+secondaryDataSet.getNoOfScreen()+"\n");
        g+=("Ticket Cost : "+secondaryDataSet.getTicketCost()+"\n");
        
        g+=("Query id : "+queryId+"\n");
        g+=("Query category : "+queryCategory+"\n");
    
        return g;
    }
    public class DataSet{
        private String theatreId;
        private String theatreName;
        private String location;
        private int noOfScreen;
        private double ticketCost;
        
        public double getTicketCost()
        {
            return ticketCost;
        }
        
        public void setTicketCost(double a)
        {
            ticketCost=a;
        }
        
        
        public int getNoOfScreen()
        {
            return noOfScreen;
        }
        
        public void setNoOfScreen(int a)
        {
            noOfScreen=a;
        }
        public String getLocation ()
        {
            return location;
        }
        public void setLocation(String a)
        {
            location=a;
        }
        
        public String getTheatreName ()
        {
            return theatreName;
        }
        public void setTheatreName(String a)
        {
            theatreName=a;
        }
        
        
        public String getTheatreId ()
        {
            return theatreId;
        }
        public void setTheatreId(String a)
        {
            theatreId=a;
        }
    }
    
    public void setSecondaryDataSet(DataSet pD)
    {
        this.secondaryDataSet=pD;
    }
    public DataSet getSecondaryDataSet()
    {
        return this.secondaryDataSet;
    }
    public void setPrimaryDataSet(DataSet pD)
    {
        this.primaryDataSet=pD;
    }
    public DataSet getPrimaryDataSet()
    {
        return this.primaryDataSet;
    }
    
    public void setQueryId (String queryId)
    {
        this.queryId=queryId;
    }
    public void setQueryCategory(String queryCategory)
    {
        this.queryCategory=queryCategory;
    }
    public String getQueryId()
    {
        return this.queryId;
    }
    public String getQueryCategory()
    {
        return this.queryCategory;
    }
}