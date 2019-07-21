(ns net.minecraftforge.common.IShearable
  "This allows for mods to create there own Shear-like items
  and have them interact with Blocks/Entities without extra work.
  Also, if your block/entity supports the Shears, this allows you
  to support mod-shears as well."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common IShearable]))

(defn shearable?
  "Checks if the object is currently shearable
   Example: Sheep return false when they have no wool

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - Block's position in world. - `net.minecraft.util.math.BlockPos`

  returns: If this is shearable, and onSheared should be called. - `boolean`"
  (^Boolean [^IShearable this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isShearable item world pos))))

(defn on-sheared
  "Performs the shear function on this object.
   This is called for both client, and server.
   The object should perform all actions related to being sheared,
   except for dropping of the items, and removal of the block.
   As those are handled by ItemShears itself.

   Returns a list of items that resulted from the shearing process.

   For entities, they should trust there internal location information
   over the values passed into this function.

  item - The itemstack that is being used, Possible to be null - `net.minecraft.item.ItemStack`
  world - The current world - `net.minecraft.world.IBlockAccess`
  pos - If this is a block, the block's position in world. - `net.minecraft.util.math.BlockPos`
  fortune - The fortune level of the shears being used - `int`

  returns: A ArrayList containing all items from this shearing. Possible to be null. - `java.util.List<net.minecraft.item.ItemStack>`"
  (^java.util.List [^IShearable this ^net.minecraft.item.ItemStack item ^net.minecraft.world.IBlockAccess world ^net.minecraft.util.math.BlockPos pos ^Integer fortune]
    (-> this (.onSheared item world pos fortune))))

