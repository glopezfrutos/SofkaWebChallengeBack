# Sofka - Training leagues
## _Web development_

### Back-end with Springboot and MySQL
To run:
- Create an MySQL Schema called "notes" (user "root", password "1234567890")
- Open the project in IntelliJ, install dependencies and run the "ToDoListApplication"

#### API examples:
##### Get all Categories and Notes: http://localhost:8081/api/get
Response:
[
    {
        "id": 1,
        "category": "travels",
        "notes": [
            {
                "id": 1,
                "note": "Colombia",
                "done": false,
                "fkCategoryId": 1
            }
        ]
    }
]

##### Add new Category: http://localhost:8081/api/save/category
Recive:
{
    "category": "Travels",
}

Response:
{
    "id": 1,
    "category": "Travels",
    "notes": []
}

##### Add new Note: http://localhost:8081/api/save/note
Recieve:
{
    "note": "Mexico",
    "done": false,
    "fkCategoryId": 1
}

Response:
{
    "id": 1,
    "category": "Travels",
    "notes": [
        {
            "id": 1,
            "note": "Colombia",
            "done": false,
            "fkCategoryId": 1
        },
        {
            "id": 1,
            "note": "Mexico",
            "done": false,
            "fkCategoryId": 1
        }
    ]
}

##### Update Note: http://localhost:8081/api/update/note
Receive:
{
    "id": 1,
    "note": "Uruguay",
    "done": true,
    "fkCategoryId": 1
}
Response:
{
    "id": 1,
    "note": "Uruguay",
    "done": true,
    "fkCategoryId": 1
}

##### Update Category: http://localhost:8081/api/update/category
{
    "id": 1,
    "category": "Travels to do"
}
Response:
{
    "id": 1,
    "category": "Travels to do",
    "notes": []
}

##### Delete Note: http://localhost:8081/api/delete/note/{id}

##### Delete Category: http://localhost:8081/api/delete/category/{id}



Student: Gustavo López Frutos.
