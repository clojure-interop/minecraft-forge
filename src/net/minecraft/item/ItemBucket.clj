(ns net.minecraft.item.ItemBucket
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBucket]))

(defn ->item-bucket
  "Constructor.

  contained-block-in - `net.minecraft.block.Block`"
  (^ItemBucket [^net.minecraft.block.Block contained-block-in]
    (new ItemBucket contained-block-in)))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemBucket this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn try-place-contained-liquid
  "player - `net.minecraft.entity.player.EntityPlayer`
  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^ItemBucket this ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in]
    (-> this (.tryPlaceContainedLiquid player world-in pos-in))))

(defn init-capabilities
  "Description copied from class: Item

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  nbt - NBT of this item serialized, or null. - `net.minecraft.nbt.NBTTagCompound`

  returns: A holder instance associated with this ItemStack where you can hold capabilities for the life of this item. - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^ItemBucket this ^net.minecraft.item.ItemStack stack ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.initCapabilities stack nbt))))

