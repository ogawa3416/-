﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Chapter1_practice
{
    public class Product
    {
        public int Code { get; private set; }
        public string Name { get; private set; }
        public int Price { get; private set; }

        // コンストラクタ
        public Product(int code, string name, int price)
        {
            this.Code = code;
            this.Name = name;
            this.Price = price;
        }

        // 消費税を求める
        public int GetTax()
        {
            return (int)(Price * 0.08);
        }

        // 税込価格を求める
        public int GetPriceIncludingTax()
        {
            return Price + GetTax();
        }
    }
}
