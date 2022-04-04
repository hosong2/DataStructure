package class0404;

class ListNode{
	private String data;
	public ListNode link;
	public ListNode() {
		data = null;
		link = null;
	}
	public ListNode(String data) {
		this.data = data;
		link = null;
	}
	public ListNode(String data, ListNode link) {
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return data;
	}
}
