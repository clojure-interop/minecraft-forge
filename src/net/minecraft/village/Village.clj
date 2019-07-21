(ns net.minecraft.village.Village
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.village Village]))

(defn ->village
  "Constructor.

  world-in - `net.minecraft.world.World`"
  (^Village [^net.minecraft.world.World world-in]
    (new Village world-in))
  (^Village []
    (new Village )))

(defn end-mating-season
  ""
  ([^Village this]
    (-> this (.endMatingSeason))))

(defn read-village-data-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^Village this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readVillageDataFromNBT compound))))

(defn block-pos-within-sq-village-radius?
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `boolean`"
  (^Boolean [^Village this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.isBlockPosWithinSqVillageRadius pos))))

(defn tick
  "tick-counter-in - `int`"
  ([^Village this ^Integer tick-counter-in]
    (-> this (.tick tick-counter-in))))

(defn set-world
  "world-in - `net.minecraft.world.World`"
  ([^Village this ^net.minecraft.world.World world-in]
    (-> this (.setWorld world-in))))

(defn find-nearest-village-aggressor
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.entity.EntityLivingBase`"
  (^net.minecraft.entity.EntityLivingBase [^Village this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.findNearestVillageAggressor entitylivingbase-in))))

(defn get-ticks-since-last-door-adding
  "returns: `int`"
  (^Integer [^Village this]
    (-> this (.getTicksSinceLastDoorAdding))))

(defn annihilated?
  "returns: `boolean`"
  (^Boolean [^Village this]
    (-> this (.isAnnihilated))))

(defn player-reputation-too-low?
  "player-name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Village this ^java.lang.String player-name]
    (-> this (.isPlayerReputationTooLow player-name))))

(defn write-village-data-to-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^Village this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeVillageDataToNBT compound))))

(defn get-village-door-info-list
  "returns: `java.util.List<net.minecraft.village.VillageDoorInfo>`"
  (^java.util.List [^Village this]
    (-> this (.getVillageDoorInfoList))))

(defn add-village-door-info
  "door-info - `net.minecraft.village.VillageDoorInfo`"
  ([^Village this ^net.minecraft.village.VillageDoorInfo door-info]
    (-> this (.addVillageDoorInfo door-info))))

(defn get-num-village-doors
  "returns: `int`"
  (^Integer [^Village this]
    (-> this (.getNumVillageDoors))))

(defn get-num-villagers
  "returns: `int`"
  (^Integer [^Village this]
    (-> this (.getNumVillagers))))

(defn get-existed-door
  "door-block - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.village.VillageDoorInfo`"
  (^net.minecraft.village.VillageDoorInfo [^Village this ^net.minecraft.util.math.BlockPos door-block]
    (-> this (.getExistedDoor door-block))))

(defn get-center
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^Village this]
    (-> this (.getCenter))))

(defn get-door-info
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.village.VillageDoorInfo`"
  (^net.minecraft.village.VillageDoorInfo [^Village this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getDoorInfo pos))))

(defn get-village-radius
  "returns: `int`"
  (^Integer [^Village this]
    (-> this (.getVillageRadius))))

(defn mating-season?
  "returns: `boolean`"
  (^Boolean [^Village this]
    (-> this (.isMatingSeason))))

(defn add-or-renew-agressor
  "entitylivingbase-in - `net.minecraft.entity.EntityLivingBase`"
  ([^Village this ^net.minecraft.entity.EntityLivingBase entitylivingbase-in]
    (-> this (.addOrRenewAgressor entitylivingbase-in))))

(defn get-player-reputation
  "player-name - `java.lang.String`

  returns: `int`"
  (^Integer [^Village this ^java.lang.String player-name]
    (-> this (.getPlayerReputation player-name))))

(defn get-nearest-door
  "pos - `net.minecraft.util.math.BlockPos`

  returns: `net.minecraft.village.VillageDoorInfo`"
  (^net.minecraft.village.VillageDoorInfo [^Village this ^net.minecraft.util.math.BlockPos pos]
    (-> this (.getNearestDoor pos))))

(defn get-nearest-target-player
  "village-defender - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^Village this ^net.minecraft.entity.EntityLivingBase village-defender]
    (-> this (.getNearestTargetPlayer village-defender))))

(defn modify-player-reputation
  "player-name - `java.lang.String`
  reputation - `int`

  returns: `int`"
  (^Integer [^Village this ^java.lang.String player-name ^Integer reputation]
    (-> this (.modifyPlayerReputation player-name reputation))))

(defn set-default-player-reputation
  "default-reputation - `int`"
  ([^Village this ^Integer default-reputation]
    (-> this (.setDefaultPlayerReputation default-reputation))))

