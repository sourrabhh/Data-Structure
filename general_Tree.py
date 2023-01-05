class treenode :
    def __init__(self, data) :
        self.data = data
        self.children = []
        self.parent = None
        
    def add_child(self, child):
        child.parent = self
        self.children.append(child)
        
    def print_tree(self) :
        print(self.data)
        for child in self.children :
            # print("\t")
            child.print_tree()       # Recursion for Printing Child Node 
        
    
        
def build_Tree() :
    root = treenode("E Commerce")   #Root Node
    
    
    
    electronics = treenode("Electronics")     # Level 1
    electronics.add_child(treenode("Laptop"))
    electronics.add_child(treenode("Mobile "))
    
    book = treenode("Book")                     # Level 1
    book.add_child(treenode("Fictional"))
    book.add_child(treenode("Non Fictional"))
    
    root.add_child(electronics)
    root.add_child(book)

    return root


if __name__ == '__main__' :
    
    
    root = build_Tree()
    root.print_tree()
    
