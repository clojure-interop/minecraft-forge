(ns net.minecraftforge.server.permission.context.AreaContext
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.server.permission.context AreaContext]))

(defn ->area-context
  "Constructor.

  ep - `net.minecraft.entity.player.EntityPlayer`
  aabb - `net.minecraft.util.math.AxisAlignedBB`"
  (^AreaContext [^net.minecraft.entity.player.EntityPlayer ep ^net.minecraft.util.math.AxisAlignedBB aabb]
    (new AreaContext ep aabb)))

(defn get
  "key - Context key - `net.minecraftforge.server.permission.context.ContextKey`

  returns: Context object - `<T> T`"
  ([^AreaContext this ^net.minecraftforge.server.permission.context.ContextKey key]
    (-> this (.get key))))

