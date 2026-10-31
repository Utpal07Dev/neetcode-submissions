class PrefixTree {
    struct TrieNode{
        TrieNode* children[26] = {};
        bool isEnd = false;
    };
    TrieNode* root;
    TrieNode* walk(const string& s){
            TrieNode* cur = root;
            for(char ch:s){
                int i = ch-'a';
                if(!cur->children[i])return nullptr;
                cur = cur->children[i];
            }
            return cur;
        }
public:
    PrefixTree() {
        root = new TrieNode();
    }
    
    void insert(string word) {
        TrieNode* cur = root;
        for(char ch:word){
            int i  = ch-'a';
            if(!cur->children[i])
                cur->children[i] = new TrieNode();
            cur = cur->children[i];
        }
        cur->isEnd = true;
    }
    
    bool search(string word) {
        TrieNode* node = walk(word);
        return node!=nullptr && node->isEnd;
    }
    
    bool startsWith(string prefix) {
        return walk(prefix)!=nullptr;
    }
};
