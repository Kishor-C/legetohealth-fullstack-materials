
import './App.css';
import { EmployeeItems, EmployeeStore } from './components/EmployeeCRUD';
function App() {
  return (
    <div className = 'container-fluid'>
      <h1 className = 'text-center'>Welcome to React with node</h1>
      <EmployeeStore />
      <hr />
      <EmployeeItems />
    </div>
  );
}
export default App;
