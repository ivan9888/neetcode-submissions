class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
      row_dic={}
      column_dic={}
      for row in range(9):
        for column in range(9):
          if board[row][column]!=".":
            row_dic[board[row][column]]=(row_dic.get(board[row][column],0)+1)
            if row_dic[board[row][column]]>1:
              return False
          if board[column][row]!=".":
            column_dic[board[column][row]]=(column_dic.get(board[column][row],0)+1)
            if column_dic[board[column][row]]>1:
              return False
        row_dic={}
        column_dic={}
      counter=0
      counter_row=0
      for row in range(1):
        for column in range(9):
          if board[row][column]!=".":
            row_dic[board[row][column]]=(row_dic.get(board[row][column],0)+1)
            if row_dic[board[row][column]]>1:
              return False
          if board[row+1][column]!=".":
            row_dic[board[row+1][column]]=(row_dic.get(board[row+1][column],0)+1)
            if row_dic[board[row+1][column]]>1:
              return False
          if board[row+2][column]!=".":
            row_dic[board[row+2][column]]=(row_dic.get(board[row+2][column],0)+1)
            if row_dic[board[row+2][column]]>1:
              return False
          counter+=1
          if counter==3:
            row_dic={}
            counter=0
        counter+=1
        if counter==3:
          row_dic={}
          counter=0
      return True