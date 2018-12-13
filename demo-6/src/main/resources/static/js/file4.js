//if (!isset($_FILES['image']['error']) || !is_int($_FILES['image']['error'])){
//  echo "ファイルアップロードエラー";
//} else {
//  $file_name = $_FILES['image']['name'];
//  $extension = pathinfo($file_name, PATHINFO_EXTENSION); //拡張子取得
//  $tmp_path = $_FILES['image']['tmp_name'];
//  $file_dir_path = "upload/";
//  $uniq_name = date("YmdHis").md5(uniqid(microtime(),1)).session_id() . "." . $extension;
//
//  if (is_uploaded_file($tmp_path)) {
//    if(move_uploaded_file( $tmp_path, $file_dir_path . $uniq_name)) {
//      chmod($file_dir_path . $uniq_name, 0644);
//    } else {
//      echo "Error:アップロードできませんでした。";
//    }
//  }
//}
var fileArea = document.getElementById('drag-drop-area');
var fileInput = document.getElementById('fileInput');


fileArea.addEventListener('dragover', function(evt){
  evt.preventDefault();
  fileArea.classList.add('dragover');
});

fileArea.addEventListener('dragleave', function(evt){
    evt.preventDefault();
    fileArea.classList.remove('dragover');
});
fileArea.addEventListener('drop', function(evt){
    evt.preventDefault();
    fileArea.classList.remove('dragenter');
    var files = evt.dataTransfer.files;
    fileInput.files = files;
});