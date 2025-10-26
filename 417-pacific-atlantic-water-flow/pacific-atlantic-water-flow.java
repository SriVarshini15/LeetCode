/* class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r=heights.length;
        int c=heights[0].length;

        List<List<Integer>> result=new ArrayList<>();


        boolean po[][]=new boolean[r][c];
        boolean ao[][]=new boolean[r][c];

        for(int i=0;i<r;i++){
            po[i][0]=true;
            ao[i][c-1]=true;
        }

        for(int i=0;i<c;i++){
            po[0][i]=true;
            ao[r-1][i]=true;
        }

        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                if(po[i][j-1]==true){
                    if(heights[i][j]>heights[i][j-1]){
                        po[i][j]=true;
                    }else{
                        po[i][j]=false;
                        break;
                    }

                }
            }
        }

        for(int i=1;i<c;i++){
            for(int j=0;j<r;j++){
                if(po[j][i-1]==true){
                    if(heights[j][i]>heights[j][i-1]){
                        po[j][i] = true;
                    }else if(po[j][i]){
                        continue;
                    }else{
                        po[j][i]=false;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=c-2;j>=0;j--){
                if(ao[i][j+1]==true){
                    if(heights[i][j+1]<heights[i][j]){
                        ao[i][j]=true;
                    }else{
                        ao[i][j]=false;
                        break;
                    }
                }
            }
        }

        for(int i=c-2;i>=0;i--){
            for(int j=r-2;j>=0;j--){
                if(ao[j+1][i]==true){
                    if(heights[j+1][i]<heights[j][i]){
                        ao[j][i]=true;
                    }else if(ao[j][i]){
                        continue;
                    }else{
                        ao[j][i]=false;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(ao[i][j] && po[i][j]){
                    List<Integer> res=new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    result.add(res);
                }
            }
        }
        return result;
    }
} */

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r = heights.length;
        int c = heights[0].length;

        List<List<Integer>> result = new ArrayList<>();

        boolean[][] po = new boolean[r][c];
        boolean[][] ao = new boolean[r][c];

        // Initial ocean borders
        for (int i = 0; i < r; i++) {
            po[i][0] = true;
            ao[i][c - 1] = true;
        }
        for (int j = 0; j < c; j++) {
            po[0][j] = true;
            ao[r - 1][j] = true;
        }

        // Multi-pass propagation for Pacific
        boolean changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (po[i][j]) continue;
                    if ((i > 0 && po[i - 1][j] && heights[i][j] >= heights[i - 1][j])
                        || (j > 0 && po[i][j - 1] && heights[i][j] >= heights[i][j - 1])
                        || (i < r - 1 && po[i + 1][j] && heights[i][j] >= heights[i + 1][j])
                        || (j < c - 1 && po[i][j + 1] && heights[i][j] >= heights[i][j + 1])) {
                        po[i][j] = true;
                        changed = true;
                    }
                }
            }
        }

        changed = true;
        while (changed) {
            changed = false;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (ao[i][j]) continue;
                    if ((i > 0 && ao[i - 1][j] && heights[i][j] >= heights[i - 1][j])
                        || (j > 0 && ao[i][j - 1] && heights[i][j] >= heights[i][j - 1])
                        || (i < r - 1 && ao[i + 1][j] && heights[i][j] >= heights[i + 1][j])
                        || (j < c - 1 && ao[i][j + 1] && heights[i][j] >= heights[i][j + 1])) {
                        ao[i][j] = true;
                        changed = true;
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (po[i][j] && ao[i][j]) {
                    List<Integer> res = new ArrayList<>();
                    res.add(i);
                    res.add(j);
                    result.add(res);
                }
            }
        }

        return result;
    }
}
