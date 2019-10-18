package com.anonymous;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;

class DataBinder
{
	int page;
	int per_page;
	int total;
	int total_pages;
	List<String> data;
	public int getPage()
	{
		return page;
	}
	public void setPage(int page)
	{
		this.page = page;
	}
	public int getPer_page()
	{
		return per_page;
	}
	public void setPer_page(int per_page)
	{
		this.per_page = per_page;
	}
	public int getTotal()
	{
		return total;
	}
	public void setTotal(int total)
	{
		this.total = total;
	}
	public int getTotal_pages()
	{
		return total_pages;
	}
	public void setTotal_pages(int total_pages)
	{
		this.total_pages = total_pages;
	}
	public List<String> getData()
	{
		return data;
	}
	public void setData(List<String> data)
	{
		this.data = data;
	}
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + page;
		result = prime * result + per_page;
		result = prime * result + total;
		result = prime * result + total_pages;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataBinder other = (DataBinder) obj;
		if (data == null)
		{
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (page != other.page)
			return false;
		if (per_page != other.per_page)
			return false;
		if (total != other.total)
			return false;
		if (total_pages != other.total_pages)
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "DataBinder [page=" + page + ", per_page=" + per_page
				+ ", total=" + total + ", total_pages=" + total_pages
				+ ", data=" + data + "]";
	}

}

public class Test9
{
	public static void main(String[] args)
	{
		/*
		 * Endpoint:
		 * "https://jsonmock.hackerrank.com/api/movies/search/?Title=substr"
		 */
		int result = 0;
		String substr = "maze";
		try
		{
			String url = "https://jsonmock.hackerrank.com/api/movies/search/?Title="
					+ substr.trim();
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();

			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null)
			{
				response.append(inputLine);
			}
			in.close();
			Gson gsonser = new Gson();
			String binder = gsonser.toJson(response.toString());
			Gson gsonsder = new Gson();
			DataBinder binder1 = gsonsder.fromJson(binder, DataBinder.class);

			System.out.println(binder1);

		} catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(result);
	}
}
