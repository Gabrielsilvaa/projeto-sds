import Footer from "components/Footer";
import NavBar from "components/NavBar";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";

function App() {
  return (
    <>
      <NavBar></NavBar>
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de vendas</h1>
        
        <div className="row px-3">

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso</h5>
            <BarChart></BarChart>
          </div>

          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
            <DonutChart></DonutChart>
          </div>
          
        </div>
        
        <div className="py-3">
          <h2 className="text-primary"></h2>
        </div>


        <DataTable></DataTable>
      </div>
      <Footer></Footer>
    </>
  );
}

export default App;