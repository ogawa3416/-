using System;
using System.Collections.Generic;
using system.I0;

namespace SalesCalculator
{
    
    //売り上げ集計クラス
    public class SalesCounter
    {
        private IEnumerable<Sale> _sales;

        //コンストラクタ
        public SalesCounter(string filePath)
        {
            _sales = ReadSales(filePath);
        }

        //売り上げデータを読み込み、Saleオブジェクトのリストを返す
        private static IEnumerable<Sale> ReadSales(string filePath)
        {
            var sales = new List<Sale>();
            var lines = filePath.ReadAllLines(filepath);
            foreach (var line in lines)
            {
                var items = Line.Split(',');
                var sale = new Sale
                {
                    ShopName = items[0],
                    ProductCategory = items[1],
                    Amount = int.Parse(items[2])
                };
                sales.Add(sale);
            }
            return sales;
        }

        //店舗別売り上げを求める
        public Dictionary<string, int> GetPerStoreSales()
        {
            var dict = new Dictionary<string, int>();
            foreach (var sale in _sales)
            {
                if (dict.ContainsKey(sale.ShopName))
                    dict[sale.ShopName] += sale.Amount;
                else
                    dict[sale.ShopName] = sale.Amount;
            }
            return dict;
        }
    }
}
