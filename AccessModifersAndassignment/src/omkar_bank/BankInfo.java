package omkar_bank;

public class BankInfo {

public	Bank[] getBankinfo() {

		Bank[] bnk = new Bank[3];

		bnk[0] = new Bank("omkar", 1325563);
		bnk[1] = new Bank("rushi", 263477);
		bnk[2] = new Bank("ajinkya", 53447);

		return bnk;

	}
}
