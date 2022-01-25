
import './App.css';
import { EmployeeItems, EmployeeStore, EmployeeUpdate } from './components/EmployeeCRUD';
import {Route, Link, Routes} from 'react-router-dom';

function Navigation() {
  return (<div className = 'alert alert-secondary'>
    <Link to = '/store'>Store</Link> /
    <Link to = '/fetchAll'>All Employees</Link> /
    <Link to = '/update'>Update Employees</Link>
  </div>)
}
function App() {
  return (
    <div className = 'container-fluid'>
      <h1 className = 'text-center'>Welcome to React with node</h1>
      <div className = 'row'>
        <div className = 'col-5'>
          <Navigation />
        </div>
      </div>
      <div className = 'row'>
        <div className = 'col'>
          <Routes>
            <Route path = '/' element = {<EmployeeItems />} />
            <Route path = '/store' element = {<EmployeeStore />} />
            <Route path = '/fetchAll' element = {<EmployeeItems />} />
            <Route path = '/update' element = {<EmployeeUpdate />} />
          </Routes>
        </div>
      </div>
    </div>
  );
}
export default App;
