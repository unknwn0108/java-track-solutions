import './App.css';
import { CalculateScore } from './Components/CalculateScore';
function App() {
  return (
    <div>
     <CalculateScore Name={'Aakash'}
     School={'CSG School'}
     total={280}
     goal={3}
     />
    </div>
  );
}

export default App;
