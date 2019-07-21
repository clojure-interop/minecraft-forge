(ns net.minecraft.block.state.pattern.BlockMaterialMatcher
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state.pattern BlockMaterialMatcher]))

(defn *for-material
  "material-in - `net.minecraft.block.material.Material`

  returns: `net.minecraft.block.state.pattern.BlockMaterialMatcher`"
  (^net.minecraft.block.state.pattern.BlockMaterialMatcher [^net.minecraft.block.material.Material material-in]
    (BlockMaterialMatcher/forMaterial material-in)))

(defn apply
  "p-apply-1 - `net.minecraft.block.state.IBlockState`

  returns: `boolean`"
  (^Boolean [^BlockMaterialMatcher this ^net.minecraft.block.state.IBlockState p-apply-1]
    (-> this (.apply p-apply-1))))

