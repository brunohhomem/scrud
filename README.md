# This is a simple crud.

## Endpoints: 

 <details align="left"> 
  <summary><b>Products</b></summary> 

### GET
	- http://localhost:8080/products
	- http://localhost:8080/products/5

### POST
	- http://localhost:8080/products
	
	{
		"name": "PC DA NASA",
		"isActive": false
	}

### PUT
	- http://localhost:8080/products/5

	{
		"name": "PC DA XUXA",
		"isActive": false
	}

### DELETE
	- http://localhost:8080/products/5
</details>

 <details align="left"> 
  <summary><b>Category</b></summary> 

### GET
	- http://localhost:8080/categories
	- http://localhost:8080/categories/2
</details>
