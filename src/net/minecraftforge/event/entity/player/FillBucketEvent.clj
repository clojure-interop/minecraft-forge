(ns net.minecraftforge.event.entity.player.FillBucketEvent
  "This event is fired when a player attempts to use a Empty bucket, it
  can be canceled to completely prevent any further processing.

  If you set the result to 'ALLOW', it means that you have processed
  the event and wants the basic functionality of adding the new
  ItemStack to your inventory and reducing the stack size to process.
  setResult(ALLOW) is the same as the old setHandled();"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player FillBucketEvent]))

(defn ->fill-bucket-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  current - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  target - `net.minecraft.util.math.RayTraceResult`"
  (^FillBucketEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack current ^net.minecraft.world.World world ^net.minecraft.util.math.RayTraceResult target]
    (new FillBucketEvent player current world target)))

(defn get-empty-bucket
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FillBucketEvent this]
    (-> this (.getEmptyBucket))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^FillBucketEvent this]
    (-> this (.getWorld))))

(defn get-target
  "returns: `net.minecraft.util.math.RayTraceResult`"
  (^net.minecraft.util.math.RayTraceResult [^FillBucketEvent this]
    (-> this (.getTarget))))

(defn get-filled-bucket
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FillBucketEvent this]
    (-> this (.getFilledBucket))))

(defn set-filled-bucket
  "bucket - `net.minecraft.item.ItemStack`"
  ([^FillBucketEvent this ^net.minecraft.item.ItemStack bucket]
    (-> this (.setFilledBucket bucket))))

