(ns net.minecraftforge.event.entity.player.ArrowLooseEvent
  "ArrowLooseEvent is fired when a player stops using a bow.
  This event is fired whenever a player stops using a bow in
  ItemBow.onPlayerStoppedUsing(ItemStack, World, EntityLivingBase, int).

  bow contains the ItemBow ItemStack that was used in this event.
  charge contains the value for how much the player had charged before stopping the shot.

  This event is Cancelable.
  If this event is canceled, the player does not stop using the bow.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player ArrowLooseEvent]))

(defn ->arrow-loose-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  bow - `net.minecraft.item.ItemStack`
  world - `net.minecraft.world.World`
  charge - `int`
  has-ammo - `boolean`"
  (^ArrowLooseEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack bow ^net.minecraft.world.World world ^Integer charge ^Boolean has-ammo]
    (new ArrowLooseEvent player bow world charge has-ammo)))

(defn get-bow
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^ArrowLooseEvent this]
    (-> this (.getBow))))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^ArrowLooseEvent this]
    (-> this (.getWorld))))

(defn has-ammo?
  "returns: `boolean`"
  (^Boolean [^ArrowLooseEvent this]
    (-> this (.hasAmmo))))

(defn get-charge
  "returns: `int`"
  (^Integer [^ArrowLooseEvent this]
    (-> this (.getCharge))))

(defn set-charge
  "charge - `int`"
  ([^ArrowLooseEvent this ^Integer charge]
    (-> this (.setCharge charge))))

