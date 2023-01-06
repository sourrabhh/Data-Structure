# Binary Tree 

class Binary_Search_Tree :
    def __init__(self, data) :
        self.data = data
        self.left = None
        self.right = None
        
    def add_Child(self, data) :
        if data == self.data :
            return
        
        if data < self.data :   # Add to Left
            if self.left :
                self.left.add_Child(data)
            else :
                self.left = Binary_Search_Tree(data)

        else :                     # Add to Right 
            if self.right :
                self.right.add_Child(data)
                
            else :
                self.right = Binary_Search_Tree(data)
                
    
    def inorder_traversal(self) :
        element = []
        
        if self.left :
            element += self.left.inorder_traversal()    # Add element in list 
        # Base Node // Root   
        element.append(self.data)  
        
        if self.right :
            element += self.right.inorder_traversal()
            
        return element
    
    def search(self,value) :
        if self.data == value :
            return True
        
        if value < self.data :
            if self.left :
                return self.left.search(value)
            else :
                return False    
        if value > self.data :
            if self.right :
                return self.right.search(value)
            else :
                return False
        
    
    
def build_Tree(element) :
    root = Binary_Search_Tree(element[0])
    
    for i in range(len(element)) :
      root.add_Child(element[i])
      
    return root


        
if __name__ == '__main__' :
    number = [54,55,997,64,879,31,9764]
    tree = build_Tree(number)
    
    print(tree.inorder_traversal())
    value = int(input("ENter the Number to search "))
    b = tree.search(value)
    
    if b == True :
        print("Found")
    else :
        print("Missing")
   
