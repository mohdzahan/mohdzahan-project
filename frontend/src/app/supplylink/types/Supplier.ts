export class Supplier {
    public supplierId: number | undefined;
    public supplierName: string;
    public email: string;
    public phone: string;
    public address: string;
    public username: string;
    public password: string;
    public role?: string;
 
    constructor(supplierId: number, supplierName: string, email: string, phone: string, address: string, username: string, password: string, role?: string) {
        this.supplierId = supplierId;
        this.supplierName = supplierName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.username = username;
        this.password = password;
        this.role = role;
    }
 
    public displayInfo(): void {
        console.log(`Supplier ID: ${this.supplierId}`);
        console.log(`Supplier name: ${this.supplierName}`);
        console.log(`email: ${this.email}`);
        console.log(`phone: ${this.phone}`);
        console.log(`address: ${this.address}`);
        console.log(`username: ${this.username}`);
        console.log(`password: ${this.password}`);
        console.log(`role: ${this.role}`);
    }
}
