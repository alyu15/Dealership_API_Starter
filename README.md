# Car Dealership API

In this project, the car dealership application has been modified into a RESTful API.

Using Postman, the user is able to access different methods in order to modify the car dealership database.

## Dealership Controller

The user of the application is able to search through the database depending on the dealership's

- Name
- Phone Number
- Dealership ID

Moreover, they are able to register a new dealership, update an already existing dealership, or even delete a dealership.

><details>
><summary> Dealership Filters </summary>
>
>><details>
>><summary> Filter By Name </summary>
>>
>> IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Phone Number </summary>
>>
>> IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By ID </summary>
>>
>>IMAGE HERE
>></details>
></details>

><details>
><summary> Modifying a Dealership </summary>
>
>><details>
>><summary> Adding a Dealership </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Updating a Dealership </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Deleting a Dealership </summary>
>>
>>IMAGE HERE
>></details>
></details>

## Vehicles Controller

Additionally, the user can use the application in order to filter through vehicles based on

- VIN
- Price
- Make/Model
- Year
- Color
- Mileage
- Type

They will also be able to modify the database by adding a vehicle, updating a vehicle, or deleting a vehicle from the 
database.

><details>
><summary> Vehicle Filters </summary>
>
>><details>
>><summary> Filter By ID </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Price </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Make </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Model </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Year </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Color </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Mileage </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Filter By Type </summary>
>>
>>IMAGE HERE
>></details>
></details>

><details>
><summary> Modifying a Vehicle </summary>
>
>><details>
>><summary> Adding a Vehicle </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Updating a Vehicle </summary>
>>
>>IMAGE HERE
>></details>
>
>><details>
>><summary> Deleting a Vehicle </summary>
>>
>>IMAGE HERE
>></details>
></details>

## Sales Contracts Controller
The user is able to utilize the GET and POST HTTP methods in order to retrieve any sales contracts in the database, 
as well as create a new sales contract to add to the database.

><details>
><summary> 'GET' a Sales Contract by Contract ID </summary>
>
> IMAGE HERE
>
></details>

><details>
><summary> 'POST' a New Sales Contract </summary>
>
> IMAGE HERE
>
></details>


## Lease Contracts Controller

The user is also able to use the GET and POST HTTP methods in order to retrieve any lease contracts in the database. 
Similar to the sales contracts, the user will be able to add to the database by creating a new lease contract.

><details>
><summary> 'GET' a Lease Contract by Contract ID </summary>
>
> IMAGE HERE
>
></details>

><details>
><summary> 'POST' a New Sales Contract </summary>
>
> IMAGE HERE
>
></details>

## Interesting Piece of Code

```
@PostMapping()
    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {

        try {

            return vehiclesDao.create(vehicle);

        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Oops... our bad.");
        }
    }
```
I found this piece of code interesting because it contains such an important task of taking a whole entire vehicle
and adding it to the database but it does it in only a couple of lines of code. I understand that the method only requires
data entry from the user and calls the 'create' method from vehiclesDao but I found it very interesting how all these 
separate things can be tied together and be utilized here.

<br>
<div align="center">
<b>Thank you for taking the time out to check out my application!</b>


</div>