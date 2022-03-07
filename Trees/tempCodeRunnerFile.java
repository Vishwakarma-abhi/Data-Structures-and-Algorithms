System.out.println("Enter the data to be searched");
        int key = sc.nextInt();
        
        if(search(root, key) == null)
        {
            System.out.println(key+ "  Not Found");
        }
        else
        {
            System.out.println(key+ " Found ");
        }
        