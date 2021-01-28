<!DOCTYPE html>
<html>
  <head>
    <title>Breakfast @ButterBeans Cafe</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">    
        <style>
body {
  background-image: url('images/butterbeanscafe.jpg') ;
  background-repeat: no-repeat;
  background-size: 100% 100%;
  opacity: 0.9;
}
</style>

  </head>
  <body>
    <div class="container">
    <form action="ProcessOrder" method="post">
    <h1>Breakfast @ButterBeans Cafe</h1>
    <h4>Make an Order</h4>
     
    <table class="table table-dark" >
        <tr>
            <td> <img src="images/hotcakes.jpg" width="340" height="293" alt="hotcakes"/> </td>
            <td> <img src="images/hashbrown.jpg" width="340" height="293" alt="hashbrown"/></td>
            <td> <img src="images/eggmuffin.jpg" width="340" height="293" alt="eggmuffin"/></td>           
        </tr>
        
    <tr><div class="checkbox"></div>
      <td><input  name="Set1Checkbox" type="checkbox" value="Hot Cakes" checked> Set 1: Hot Cakes with drink</td>
      <td><input name="Set2Checkbox" type="checkbox" value="Hash Brown" checked> Set 2: Hash Brown with drink</td>
      <td><input name="Set3Checkbox" type="checkbox" value="Egg Muffin" checked> Set 3: Egg Muffin with drink</td>
    </tr>
    
    <tr>
      <td>Select Drink: 
        <select name="set1DrinkOption">
          <option>Coffee</option>
          <option>Milo</option>
          <option>Tea</option>
        </select>
      </td>
      <td>
          Select Drink: 
        <select name="set2DrinkOption">
          <option>Coffee</option>
          <option>Milo</option>
          <option>Tea</option>
        </select>
      </td>
      <td>
          Select Drink: 
        <select name="set3DrinkOption">
          <option>Coffee</option>
          <option>Milo</option>
          <option>Tea</option>
        </select>
      </td>
    </tr>
    
    <tr><div class="form-control">
      <td>Quantity: <input type="text" name="set1OrderQuantity" value="0" size="5" /></td>
      <td>
          Quantity: <input type="text" name="set2OrderQuantity" value="0" size="5" />
      </td>
      <td>
          Quantity: <input type="text" name="set3OrderQuantity" value="0" size="5" />
      </td>
    </div></tr>
    
    <tr>
        <td><div style="text-align: left;">Prices (Set 1 with) : <br>
         Coffee : RM8.00 <br>
         Milo &nbsp;&nbsp;  : RM9.00 <br>
         Tea  &nbsp;&nbsp;&nbsp;  : RM6.50 <br></div>
     </td>
     <td>
         <div style="text-align: left;">Prices (set 2 with) : <br>
         Coffee : RM4.00 <br>
         Milo &nbsp;&nbsp;  : RM5.00 <br>
         Tea  &nbsp;&nbsp;&nbsp;  : RM3.50 <br></div>
     </td>
     <td><div style="text-align: left;">
             Prices (set 3 with) : <br>
         Coffee : RM9.50 <br>
         Milo &nbsp;&nbsp;  : RM10.50 <br>
         Tea  &nbsp;&nbsp;&nbsp;  : RM7.50 <br></div>
     </td>
    </tr>
    </table>
    <input class="btn btn-success" type="submit" value="Order" name="orderBtn" />
    <input class="btn btn-success" type="reset" value="Reset" name="resetBtn" />
    <br>
   </form>
  </div>
  </body>
</html>