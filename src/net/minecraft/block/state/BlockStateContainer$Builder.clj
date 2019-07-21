(ns net.minecraft.block.state.BlockStateContainer$Builder
  "Forge added class to make building things easier.
  Will return an instance of BlockStateContainer appropriate for
  the list of properties passed in.

  Example usage:

    protected BlockStateContainer createBlockState()
    {
        return (new BlockStateContainer.Builder(this)).add(FACING).add(SOME_UNLISTED).build();
    }"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state BlockStateContainer$Builder]))

(defn ->builder
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^BlockStateContainer$Builder [^net.minecraft.block.Block block]
    (new BlockStateContainer$Builder block)))

(defn add
  "props - `net.minecraft.block.properties.IProperty`

  returns: `net.minecraft.block.state.BlockStateContainer$Builder`"
  (^net.minecraft.block.state.BlockStateContainer$Builder [^BlockStateContainer$Builder this ^net.minecraft.block.properties.IProperty props]
    (-> this (.add props))))

(defn build
  "returns: `net.minecraft.block.state.BlockStateContainer`"
  (^net.minecraft.block.state.BlockStateContainer [^BlockStateContainer$Builder this]
    (-> this (.build))))

