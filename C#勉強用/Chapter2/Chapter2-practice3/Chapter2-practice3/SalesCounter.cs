﻿using System;
using System.Collections.Generic;
using System.Text;
using System.IO;

namespace Chapter2_practice3
{
    public class SalesCounter
    {
        private IEnumerable<Sale> _sales;

        // コンストラクタ
        public SalesCounter(string filePath)
        {
            _sales = ReadSales(filePath);
        }

        // 売り上げデータを読み込み、Saleオブジェクトのリストを返す
        private static IEnumerable<Sale> ReadSales(string filePath)
        {
            var sales = new List<Sale>();
            var lines = File.ReadAllLines(filePath);
            foreach (var line in lines)
            {
                var items = line.Split(',');
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


        // 商品カテゴリ別売り上げを求める
        public IDictionary<string, int> GetPerCategorySales()
        {
            var dict = new Dictionary<string, int>();
            foreach (var sale in _sales)
            {
                if (dict.ContainsKey(sale.ProductCategory))
                    dict[sale.ProductCategory] += sale.Amount;
                else
                    dict[sale.ProductCategory] = sale.Amount;
            }
            return dict;
        }
    }
}
