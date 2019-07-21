(ns net.minecraft.item.ItemBucketMilk
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemBucketMilk]))

(defn ->item-bucket-milk
  "Constructor."
  (^ItemBucketMilk []
    (new ItemBucketMilk )))

(defn on-item-use-finish
  "stack - `net.minecraft.item.ItemStack`
  world-in - `net.minecraft.world.World`
  entity-living - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ItemBucketMilk this ^net.minecraft.item.ItemStack stack ^net.minecraft.world.World world-in ^net.minecraft.entity.EntityLivingBase entity-living]
    (-> this (.onItemUseFinish stack world-in entity-living))))

(defn get-max-item-use-duration
  "stack - `net.minecraft.item.ItemStack`

  returns: `int`"
  (^Integer [^ItemBucketMilk this ^net.minecraft.item.ItemStack stack]
    (-> this (.getMaxItemUseDuration stack))))

(defn get-item-use-action
  "stack - `net.minecraft.item.ItemStack`

  returns: `net.minecraft.item.EnumAction`"
  (^net.minecraft.item.EnumAction [^ItemBucketMilk this ^net.minecraft.item.ItemStack stack]
    (-> this (.getItemUseAction stack))))

(defn on-item-right-click
  "world-in - `net.minecraft.world.World`
  player-in - `net.minecraft.entity.player.EntityPlayer`
  hand-in - `net.minecraft.util.EnumHand`

  returns: `net.minecraft.util.ActionResult<net.minecraft.item.ItemStack>`"
  (^net.minecraft.util.ActionResult [^ItemBucketMilk this ^net.minecraft.world.World world-in ^net.minecraft.entity.player.EntityPlayer player-in ^net.minecraft.util.EnumHand hand-in]
    (-> this (.onItemRightClick world-in player-in hand-in))))

(defn init-capabilities
  "Description copied from class: Item

  stack - The ItemStack - `net.minecraft.item.ItemStack`
  nbt - NBT of this item serialized, or null. - `net.minecraft.nbt.NBTTagCompound`

  returns: A holder instance associated with this ItemStack where you can hold capabilities for the life of this item. - `net.minecraftforge.common.capabilities.ICapabilityProvider`"
  (^net.minecraftforge.common.capabilities.ICapabilityProvider [^ItemBucketMilk this ^net.minecraft.item.ItemStack stack ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.initCapabilities stack nbt))))

