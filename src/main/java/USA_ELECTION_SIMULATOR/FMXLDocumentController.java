package USA_ELECTION_SIMULATOR;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Side;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


public class FMXLDocumentController implements Initializable {


    
    
    ////////BUTTONS////////
    @FXML private static MenuItem exitBtn;
    @FXML private Button endTurnBtn;

    ///////BOXES///////
    @FXML private AnchorPane legend;

    //////////LABELS//////
    @FXML private Label timeLabel;
    @FXML private Label moneyLabel;
    @FXML private Label electoralVotesLabel;
    @FXML private Label stateTypeLabel;
    @FXML protected Label GOPSupport;
    @FXML protected Label DEMSupport;
    @FXML protected Label undecided;

    ///////PIECHART///////
    @FXML private PieChart support;
    

    ////////////STATES GEOMETRY////////////////
    @FXML private Polygon AL;
    @FXML private Button AK;
    @FXML private Polygon AR;
    @FXML private Polygon AZ;
    @FXML private Polygon CA;
    @FXML private Polygon CO;
    @FXML private Polygon CT;
    @FXML private Polygon DE;
    @FXML private Button DC;
    @FXML private Polygon FL;
    @FXML private Polygon GA;
    @FXML private Polygon ID;
    @FXML private Polygon IL;
    @FXML private Polygon IN;
    @FXML private Polygon IA;
    @FXML private Button HI;
    @FXML private Polygon KS;
    @FXML private Polygon KY;
    @FXML private Polygon LA;
    @FXML private Polygon ME;
    @FXML private Polygon MD;
    @FXML private Polygon MA;
    @FXML private Polygon MI;
    @FXML private Polygon MN;
    @FXML private Polygon MS;
    @FXML private Polygon MO;
    @FXML private Polygon MT;
    @FXML private Polygon NE;
    @FXML private Polygon NV;
    @FXML private Polygon NH;
    @FXML private Polygon NJ;
    @FXML private Polygon NM;
    @FXML private Polygon NY;
    @FXML private Polygon NC;
    @FXML private Polygon ND;
    @FXML private Polygon OH;
    @FXML private Polygon OK;
    @FXML private Polygon OR;
    @FXML private Polygon PA;
    @FXML private Polygon RI;
    @FXML private Polygon SC;
    @FXML private Polygon SD;
    @FXML private Polygon TN;
    @FXML private Polygon TX;
    @FXML private Polygon UT;
    @FXML private Polygon VA;
    @FXML private Polygon VT;
    @FXML private Polygon WA;
    @FXML private Polygon WI;
    @FXML private Polygon WV;
    @FXML private Polygon WY;

    ///////////ALABAMA///////////

    State al = App.GAME.USA.get(0);

    @FXML void colorStateAL(){
        colorState(AL, al);
    }

    @FXML void clickStateAL(Event event){
        AL.setFill(Color.GREEN);
        showPieChart(al);
    }
    @FXML void hoverOverStateAL(Event event){
        AL.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateAL(Event event){
        colorStateAL();
    }

    ///////////ALASKA////////////
    
    State ak = App.GAME.USA.get(1);

    @FXML void colorStateAK(){
        colorStateBtn(AK, ak);
    }

    @FXML void clickStateAK(Event event){
        AK.setStyle("-fx-background-color: GREEN ;");
        showPieChart(ak);
    }
    @FXML void hoverOverStateAK(Event event){
        AK.setStyle("-fx-background-color: LIGHTGREEN ;");
    }
    @FXML void exitOverStateAK(Event event){
        colorStateAK();
    }



    ///////////ARIZONA///////////

    State az = App.GAME.USA.get(2);

    @FXML void colorStateAZ(){
        colorState(AZ, az);
    }

    @FXML void clickStateAZ(Event event){
        AZ.setFill(Color.GREEN);
        showPieChart(az);
    }
    @FXML void hoverOverStateAZ(Event event){
        AZ.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateAZ(Event event){
        colorStateAZ();
    }

    ///////////ARKANSAS///////////

    State ar = App.GAME.USA.get(3);

    @FXML void colorStateAR(){
        colorState(AR, ar);
    }

    @FXML void clickStateAR(Event event){
        AR.setFill(Color.GREEN);
        showPieChart(ar);
    }
    @FXML void hoverOverStateAR(Event event){
        AR.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateAR(Event event){
        colorStateAR();
    }

    ///////////CALIFORNIA///////////

    State ca = App.GAME.USA.get(4);

    @FXML void colorStateCA(){
        colorState(CA, ca);
    }

    @FXML void clickStateCA(Event event){
        CA.setFill(Color.GREEN);
        showPieChart(ca);
    }
    @FXML void hoverOverStateCA(Event event){
        CA.setFill(Color.LIGHTGREEN);
        
    }
    @FXML void exitOverStateCA(Event event){
        colorStateCA();
    }


    ///////////COLORADO///////////

    State co = App.GAME.USA.get(5);

    @FXML void colorStateCO(){
        colorState(CO, co);
    }

    @FXML void clickStateCO(Event event){
        CO.setFill(Color.GREEN);
        showPieChart(co);
    }
    @FXML void hoverOverStateCO(Event event){
        CO.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateCO(Event event){
        colorStateCO();
    }

    ///////////CONNECTICET///////////

    State ct = App.GAME.USA.get(6);

    @FXML void colorStateCT(){
        colorState(CT, ct);
    }

    @FXML void clickStateCT(Event event){
        CT.setFill(Color.GREEN);
        showPieChart(ct);
    }
    @FXML void hoverOverStateCT(Event event){
        CT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateCT(Event event){
        colorStateCT();
    }

    ///////////DELAWARE///////////

    State de = App.GAME.USA.get(7);

    @FXML void colorStateDE(){
        colorState(DE, de);
    }

    @FXML void clickStateDE(Event event){
        DE.setFill(Color.GREEN);
        showPieChart(de);
    }
    @FXML void hoverOverStateDE(Event event){
        DE.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateDE(Event event){
        colorStateDE();
    }

    ///////////DISTRICT OF COLUMBIA///////////

    State dc = App.GAME.USA.get(8);

    @FXML void colorStateDC(){
        colorStateBtn(DC, dc);
    }

    @FXML void clickStateDC(Event event){
        DC.setStyle("-fx-background-color: GREEN ;");
        showPieChart(dc);
    }
    @FXML void hoverOverStateDC(Event event){
        DC.setStyle("-fx-background-color: LIGHTGREEN ;");
    }
    @FXML void exitOverStateDC(Event event){
        colorStateDC();
    }

    ///////////FLORIDA///////////

    State fl = App.GAME.USA.get(9);

    @FXML void colorStateFL(){
        colorState(FL, fl);
    }

    @FXML void clickStateFL(Event event){
        FL.setFill(Color.GREEN);
        showPieChart(fl);
    }
    @FXML void hoverOverStateFL(Event event){
        FL.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateFL(Event event){
        colorStateFL();
    }

    ///////////GEORGIA///////////

    State ga = App.GAME.USA.get(10);

    @FXML void colorStateGA(){
        colorState(GA, ga);
    }

    @FXML void clickStateGA(Event event){
        GA.setFill(Color.GREEN);
        showPieChart(ga);
    }
    @FXML void hoverOverStateGA(Event event){
        GA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateGA(Event event){
        colorStateGA();
    }

    ///////////HAWAII///////////

    State hi = App.GAME.USA.get(11);

    @FXML void colorStateHI(){
        colorStateBtn(HI, hi);
    }

    @FXML void clickStateHI(Event event){
        HI.setStyle("-fx-background-color: GREEN ;");
        showPieChart(hi);
    }
    @FXML void hoverOverStateHI(Event event){
        HI.setStyle("-fx-background-color: LIGHTGREEN ;");
    }
    @FXML void exitOverStateHI(Event event){
        colorStateHI();
    }

    ///////////IDAHO///////////

    State id = App.GAME.USA.get(12);

    @FXML void colorStateID(){
        colorState(ID, id);
    }

    @FXML void clickStateID(Event event){
        ID.setFill(Color.GREEN);
        showPieChart(id);
    }
    @FXML void hoverOverStateID(Event event){
        ID.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateID(Event event){
        colorStateID();
    }

    ///////////ILLANOIS///////////

    State il = App.GAME.USA.get(13);

    @FXML void colorStateIL(){
        colorState(IL, il);
    }

    @FXML void clickStateIL(Event event){
        IL.setFill(Color.GREEN);
        showPieChart(il);
    }
    @FXML void hoverOverStateIL(Event event){
        IL.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateIL(Event event){
        colorStateIL();
    }

    ///////////INDIANA///////////

    State in = App.GAME.USA.get(14);

    @FXML void colorStateIN(){
        colorState(IN, in);
    }

    @FXML void clickStateIN(Event event){
        IN.setFill(Color.GREEN);
        showPieChart(in);
    }
    @FXML void hoverOverStateIN(Event event){
        IN.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateIN(Event event){
        colorStateIN();
    }

    ///////////IOWA///////////

    State ia = App.GAME.USA.get(15);

    @FXML void colorStateIA(){
        colorState(IA, ia);
    }

    @FXML void clickStateIA(Event event){
        IA.setFill(Color.GREEN);
        showPieChart(ia);
    }
    @FXML void hoverOverStateIA(Event event){
        IA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateIA(Event event){
        colorStateIA();
    }

    ///////////KANSAS///////////

    State ks = App.GAME.USA.get(16);

    @FXML void colorStateKS(){
        colorState(KS, ks);
    }

    @FXML void clickStateKS(Event event){
        KS.setFill(Color.GREEN);
        showPieChart(ks);
    }
    @FXML void hoverOverStateKS(Event event){
        KS.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateKS(Event event){
        colorStateKS();
    }

    ///////////KENTUCKY///////////

    State ky = App.GAME.USA.get(17);

    @FXML void colorStateKY(){
        colorState(KY, ky);
    }

    @FXML void clickStateKY(Event event){
        KY.setFill(Color.GREEN);
        showPieChart(ky);
    }
    @FXML void hoverOverStateKY(Event event){
        KY.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateKY(Event event){
        colorStateKY();
    }

    ///////////LUISIANNA///////////

    State la = App.GAME.USA.get(18);

    @FXML void colorStateLA(){
        colorState(LA, la);
    }

    @FXML void clickStateLA(Event event){
        LA.setFill(Color.GREEN);
        showPieChart(la);
    }
    @FXML void hoverOverStateLA(Event event){
        LA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateLA(Event event){
        colorStateLA();
    }

    ///////////MEINE///////////

    State me = App.GAME.USA.get(19);

    @FXML void colorStateME(){
        colorState(ME, me);
    }

    @FXML void clickStateME(Event event){
        ME.setFill(Color.GREEN);
        showPieChart(me);
    }
    @FXML void hoverOverStateME(Event event){
        ME.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateME(Event event){
        colorStateME();
    }


    ///////////MARYLAND///////////

    State md = App.GAME.USA.get(20);

    @FXML void colorStateMD(){
        colorState(MD, md);
    }

    @FXML void clickStateMD(Event event){
        MD.setFill(Color.GREEN);
        showPieChart(md);
    }
    @FXML void hoverOverStateMD(Event event){
        MD.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMD(Event event){
        colorStateMD();
    }

    ///////////MASSACHUSETTS///////////

    State ma = App.GAME.USA.get(21);

    @FXML void colorStateMA(){
        colorState(MA, ma);
    }

    @FXML void clickStateMA(Event event){
        MA.setFill(Color.GREEN);
        showPieChart(ma);
    }
    @FXML void hoverOverStateMA(Event event){
        MA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMA(Event event){
        colorStateMA();
    }


    ///////////MICHIGAN///////////

    State mi = App.GAME.USA.get(22);

    @FXML void colorStateMI(){
        colorState(MI, mi);
    }

    @FXML void clickStateMI(Event event){
        MI.setFill(Color.GREEN);
        showPieChart(mi);
    }
    @FXML void hoverOverStateMI(Event event){
        MI.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMI(Event event){
        colorStateMI();
    }


    ///////////MINNESOTA///////////

    State mn = App.GAME.USA.get(23);

    @FXML void colorStateMN(){
        colorState(MN, mn);
    }

    @FXML void clickStateMN(Event event){
        MN.setFill(Color.GREEN);
        showPieChart(mn);
    }
    @FXML void hoverOverStateMN(Event event){
        MN.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMN(Event event){
        colorStateMN();
    }
    
    ///////////MISSISSIPPI///////////

    State ms = App.GAME.USA.get(24);

    @FXML void colorStateMS(){
        colorState(MS, ms);
    }

    @FXML void clickStateMS(Event event){
        MS.setFill(Color.GREEN);
        showPieChart(ms);
    }
    @FXML void hoverOverStateMS(Event event){
        MS.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMS(Event event){
        colorStateMS();
    }

    ///////////MISSOURI///////////

    State mo = App.GAME.USA.get(25);

    @FXML void colorStateMO(){
        colorState(MO, mo);
    }

    @FXML void clickStateMO(Event event){
        MO.setFill(Color.GREEN);
        showPieChart(mo);
    }
    @FXML void hoverOverStateMO(Event event){
        MO.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMO(Event event){
        colorStateMO();
    }

    ///////////MONTANA///////////

    State mt = App.GAME.USA.get(26);

    @FXML void colorStateMT(){
        colorState(MT, mt);
    }

    @FXML void clickStateMT(Event event){
        MT.setFill(Color.GREEN);
        showPieChart(mt);
    }
    @FXML void hoverOverStateMT(Event event){
        MT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateMT(Event event){
        colorStateMT();
    }
    

    ///////////NEBRASCA///////////

    State ne = App.GAME.USA.get(27);

    @FXML void colorStateNE(){
        colorState(NE, ne);
    }

    @FXML void clickStateNE(Event event){
        NE.setFill(Color.GREEN);
        showPieChart(ne);
    }
    @FXML void hoverOverStateNE(Event event){
        NE.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNE(Event event){
        colorStateNE();
    } 

    ///////////NEVADA///////////

    State nv = App.GAME.USA.get(28);

    @FXML void colorStateNV(){
        colorState(NV, nv);
    }

    @FXML void clickStateNV(Event event){
        NV.setFill(Color.GREEN);
        showPieChart(nv);
    }
    @FXML void hoverOverStateNV(Event event){
        NV.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNV(Event event){
        colorStateNV();
    } 

    ///////////NEW HAMPSHIRE///////////

    State nh = App.GAME.USA.get(29);

    @FXML void colorStateNH(){
        colorState(NH, nh);
    }

    @FXML void clickStateNH(Event event){
        NH.setFill(Color.GREEN);
        showPieChart(nh);
    }
    @FXML void hoverOverStateNH(Event event){
        NH.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNH(Event event){
        colorStateNH();
    } 

    ///////////NEW JARSEY///////////

    State nj = App.GAME.USA.get(30);

    @FXML void colorStateNJ(){
        colorState(NJ, nj);
    }

    @FXML void clickStateNJ(Event event){
        NJ.setFill(Color.GREEN);
        showPieChart(nj);
    }
    @FXML void hoverOverStateNJ(Event event){
        NJ.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNJ(Event event){
        colorStateNJ();
    } 

    ///////////NEW MEXICO///////////

    State nm = App.GAME.USA.get(31);

    @FXML void colorStateNM(){
        colorState(NM, nm);
    }

    @FXML void clickStateNM(Event event){
        NM.setFill(Color.GREEN);
        showPieChart(nm);
    }
    @FXML void hoverOverStateNM(Event event){
        NM.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNM(Event event){
        colorStateNM();
    }

    ///////////NEW YORK///////////

    State ny = App.GAME.USA.get(32);

    @FXML void colorStateNY(){
        colorState(NY, ny);
    }

    @FXML void clickStateNY(Event event){
        NY.setFill(Color.GREEN);
        showPieChart(ny);
    }
    @FXML void hoverOverStateNY(Event event){
        NY.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNY(Event event){
        colorStateNY();
    }

    ///////////NORTH CAROLINA///////////

    State nc = App.GAME.USA.get(33);

    @FXML void colorStateNC(){
        colorState(NC, nc);
    }

    @FXML void clickStateNC(Event event){
        NC.setFill(Color.GREEN);
        showPieChart(nc);
    }
    @FXML void hoverOverStateNC(Event event){
        NC.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateNC(Event event){
        colorStateNC();
    }

    ///////////NORTH DAKOTA///////////

    State nd = App.GAME.USA.get(34);

    @FXML void colorStateND(){
        colorState(ND, nd);
    }

    @FXML void clickStateND(Event event){
        ND.setFill(Color.GREEN);
        showPieChart(nd);
    }
    @FXML void hoverOverStateND(Event event){
        ND.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateND(Event event){
        colorStateND();
    }

    ///////////OHIO///////////
    
    State oh = App.GAME.USA.get(35);

    @FXML void colorStateOH(){
        colorState(OH, oh);
    }

    @FXML void clickStateOH(Event event){
        showPieChart(oh);
        OH.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateOH(Event event){
        OH.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateOH(Event event){
        colorStateOH();
    }
    

    ///////////OKLAHOMA///////////
    State ok = App.GAME.USA.get(36);

    @FXML void colorStateOK(){
        colorState(OK, ok);
    }

    @FXML void clickStateOK(Event event){
        showPieChart(ok);
        OK.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateOK(Event event){
        OK.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateOK(Event event){
        colorStateOK();
    }
    
    ///////////OREGON///////////

    State or = App.GAME.USA.get(37);

    @FXML void colorStateOR(){
        colorState(OR, or);
    }

    @FXML void clickStateOR(Event event){
        showPieChart(or);
        OR.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateOR(Event event){
        OR.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateOR(Event event){
        colorStateOR();
    }

    ///////////PENNSYLVANIA///////////

    State pa = App.GAME.USA.get(38);

    @FXML void colorStatePA(){
        colorState(PA, pa);
    }

    @FXML void clickStatePA(Event event){
        showPieChart(pa);
        PA.setFill(Color.GREEN);
    }
    @FXML void hoverOverStatePA(Event event){
        PA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStatePA(Event event){
        colorStatePA();
    }

    ///////////RHODE ISLAND///////////

    State ri = App.GAME.USA.get(39);

    @FXML void colorStateRI(){
        colorState(RI, ri);
    }

    @FXML void clickStateRI(Event event){
        showPieChart(ri);
        RI.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateRI(Event event){
        RI.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateRI(Event event){
        colorStateRI();
    }

    ///////////SOUTH CAROLINA///////////

    State sc = App.GAME.USA.get(40);

    @FXML void colorStateSC(){
        colorState(SC, sc);
    }

    @FXML void clickStateSC(Event event){
        showPieChart(sc);
        SC.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateSC(Event event){
        SC.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateSC(Event event){
        colorStateSC();
    }

    ///////////SOUTH DAKOTA///////////

    State sd = App.GAME.USA.get(41);

    @FXML void colorStateSD(){
        colorState(SD, sd);
    }

    @FXML void clickStateSD(Event event){
        showPieChart(sd);
        SD.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateSD(Event event){
        SD.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateSD(Event event){
        colorStateSD();
    }

    ///////////TENNESSEE///////////

    State tn = App.GAME.USA.get(42);

    @FXML void colorStateTN(){
        colorState(TN, tn);
    }

    @FXML void clickStateTN(Event event){
        showPieChart(tn);
        TN.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateTN(Event event){
        TN.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateTN(Event event){
        colorStateTN();
    }

    ///////////TEXAS///////////

    State tx = App.GAME.USA.get(43);

    @FXML void colorStateTX(){
        colorState(TX, tx);
    }

    @FXML void clickStateTX(Event event){
        showPieChart(tx);
        TX.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateTX(Event event){
        TX.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateTX(Event event){
        colorStateTX();
    }

    ///////////UTAH///////////

    State ut = App.GAME.USA.get(44);

    @FXML void colorStateUT(){
        colorState(UT, ut);
    }

    @FXML void clickStateUT(Event event){
        UT.setFill(Color.GREEN);
        showPieChart(ut);
    }
    @FXML void hoverOverStateUT(Event event){
        UT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateUT(Event event){
        colorStateUT();
    }

    ///////////VERMONT///////////

    State vt = App.GAME.USA.get(45);

    @FXML void colorStateVT(){
        colorState(VT, vt);
    }

    @FXML void clickStateVT(Event event){
        VT.setFill(Color.GREEN);
        showPieChart(vt);
    }
    @FXML void hoverOverStateVT(Event event){
        VT.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateVT(Event event){
        colorStateVT();
    }

    ///////////VIRGINIA///////////

    State va = App.GAME.USA.get(46);

    @FXML void colorStateVA(){
        colorState(VA, va);
    }

    @FXML void clickStateVA(Event event){
        VA.setFill(Color.GREEN);
        showPieChart(va);
    }
    @FXML void hoverOverStateVA(Event event){
        VA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateVA(Event event){
        colorStateVA();
    }

    ///////////WASCHINGTON///////////

    State wa = App.GAME.USA.get(47);

    @FXML void colorStateWA(){
        colorState(WA, wa);
    }

    @FXML void clickStateWA(Event event){
        WA.setFill(Color.GREEN);
        showPieChart(wa);
    }
    @FXML void hoverOverStateWA(Event event){
        WA.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWA(Event event){
        colorStateWA();
    }

    ///////////WEST VIRGINIA///////////

    State wv = App.GAME.USA.get(48);

    @FXML void colorStateWV(){
        colorState(WV, wv);
    }

    @FXML void clickStateWV(Event event){
        WV.setFill(Color.GREEN);
        showPieChart(wv);
    }
    @FXML void hoverOverStateWV(Event event){
        WV.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWV(Event event){
        colorStateWV();
    }

    ///////////WINSOCSIN///////////
    State wi = App.GAME.USA.get(49);

    @FXML void colorStateWI(){
        colorState(WI, wi);
    }

    @FXML void clickStateWI(Event event){
        WI.setFill(Color.GREEN);
        showPieChart(wi);
    }
    @FXML void hoverOverStateWI(Event event){
        WI.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWI(Event event){
        colorStateWI();
    }


    ///////////WYOMING///////////

    State wy = App.GAME.USA.get(50);

    @FXML void colorStateWY(){
        colorState(WY, wy);
    }

    @FXML void clickStateWY(Event event){
        WY.setFill(Color.GREEN);
    }
    @FXML void hoverOverStateWY(Event event){
        WY.setFill(Color.LIGHTGREEN);
    }
    @FXML void exitOverStateWY(Event event){
        colorStateWY();
    }
   
    @FXML void showPieChart(State state) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
            new PieChart.Data("Democratic Party support", state.DEMSupport),
            new PieChart.Data("Republican Party support", state.GOPSupport),
            new PieChart.Data("undecided", state.getUndecided())
        );
        support.setData(pieChartData);
        support.setTitle("Election Pools in " + state.name);
        String GOPpool = String.format("%.2f", state.GOPSupport * 100);
        String DEMpool = String.format("%.2f", state.DEMSupport * 100);
        String undecidedStr = String.format("%.2f", state.getUndecided() * 100);
        GOPSupport.setText(GOPpool + "%");
        DEMSupport.setText(DEMpool + "%");
        undecided.setText(undecidedStr + "%");
        legend.setVisible(true);
    }

    @FXML void colorStateBtn(Button b, State s){
        if (s.DEMSupport > s.GOPSupport){
            b.setStyle("-fx-background-color: BLUE; -fx-border-width: 3px; -fx-border-color: black;");
            // b.setOpacity(s.DEMSupport + s.getUndecided())
        }
            
        else{
            b.setStyle("-fx-background-color: RED; -fx-border-width: 3px; -fx-border-color: black;");
            // b.setOpacity(s.GOPSupport + s.getUndecided());
        }
    }

    @FXML void colorState(Polygon pol, State s){


        if (s.DEMSupport > s.GOPSupport){
            pol.setFill(Color.rgb(0, 0, 255));
            pol.setStyle("-fx-border-color: transparent;");
        }
            
        else{
            pol.setFill(Color.rgb(255, 0, 0));
            pol.setStyle("-fx-border-color: transparent;");
        }
            
    }

    @FXML void hidePieChart(State state) {
        support.setVisible(false);
    }


    @FXML public void initLabels() {
        timeLabel.setText("Weeks until election: " + App.GAME.getWeekTillElections());
        electoralVotesLabel.setText("Electoral votes: " + App.GAME.countVotes());
        moneyLabel.setText("Money: " + App.GAME.getMoney()+ "$");
        legend.setVisible(false);
    }

    @FXML public void colorMap(){
        colorStateAL();
        colorStateAK();
        colorStateAR();
        colorStateAZ();
        colorStateCA();
        colorStateCO();
        colorStateCT();
        colorStateDE();
        colorStateDC();
        colorStateFL();
        colorStateGA();
        colorStateID();
        colorStateIL();
        colorStateIN();
        colorStateIA();
        colorStateHI();
        colorStateKS();
        colorStateKY();
        colorStateLA();
        colorStateMA();
        colorStateME();
        colorStateMD();
        colorStateMI();
        colorStateMN();
        colorStateMS();
        colorStateMO();
        colorStateMT();
        colorStateNV();
        colorStateNY();
        colorStateNE();
        colorStateNJ();
        colorStateNH();
        colorStateNM();
        colorStateNC();
        colorStateND();
        colorStateOH();
        colorStateOR();
        colorStateOK();
        colorStatePA();
        colorStateRI();
        colorStateSC();
        colorStateSD();
        colorStateTN();
        colorStateTX();
        colorStateUT();
        colorStateVA();
        colorStateVT();
        colorStateWA();
        colorStateWI();
        colorStateWV();
        colorStateWY();
    }


    @FXML
    void exitFromGame(ActionEvent event) {
        System.exit(0);
    }

    @FXML void endTurn(Event event){
        App.GAME.finishTurn();
        if(App.GAME.gameOver ==false){
            initLabels();
        }
        else{
            App.screenController.activate("results");
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initLabels();
        colorMap();
    }
    

}