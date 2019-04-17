/**
 *  interface que permite crear un objeto DTO de factura
 */
export interface factura{
    idFactura : number;
    cliente : number ; 
    iva : number ; 
    total : number;
}