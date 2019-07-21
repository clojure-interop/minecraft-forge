(ns net.minecraftforge.server.permission.context.BlockPosContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context BlockPosContext]))

(defn ->block-pos-context
  "Constructor.

  ep - `net.minecraft.entity.player.EntityPlayer`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`
  f - `net.minecraft.util.EnumFacing`"
  (^BlockPosContext [^net.minecraft.entity.player.EntityPlayer ep ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state ^net.minecraft.util.EnumFacing f]
    (new BlockPosContext ep pos state f))
  (^BlockPosContext [^net.minecraft.entity.player.EntityPlayer ep ^net.minecraft.util.math.ChunkPos pos]
    (new BlockPosContext ep pos)))

(defn get
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: Context object - `<T> T`"
  ([^BlockPosContext this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.get key))))

