(ns net.minecraft.util.DamageSource
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util DamageSource]))

(defn ->damage-source
  "Constructor.

  damage-type-in - `java.lang.String`"
  (^DamageSource [^java.lang.String damage-type-in]
    (new DamageSource damage-type-in)))

(def *-in-fire
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/IN_FIRE)

(def *-lightning-bolt
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/LIGHTNING_BOLT)

(def *-on-fire
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/ON_FIRE)

(def *-lava
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/LAVA)

(def *-hot-floor
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/HOT_FLOOR)

(def *-in-wall
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/IN_WALL)

(def *-cramming
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/CRAMMING)

(def *-drown
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/DROWN)

(def *-starve
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/STARVE)

(def *-cactus
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/CACTUS)

(def *-fall
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/FALL)

(def *-fly-into-wall
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/FLY_INTO_WALL)

(def *-out-of-world
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/OUT_OF_WORLD)

(def *-generic
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/GENERIC)

(def *-magic
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/MAGIC)

(def *-wither
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/WITHER)

(def *-anvil
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/ANVIL)

(def *-falling-block
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/FALLING_BLOCK)

(def *-dragon-breath
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/DRAGON_BREATH)

(def *-field-191552-t
  "Static Constant.

  type: net.minecraft.util.DamageSource"
  DamageSource/field_191552_t)

(defn damage-type
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^DamageSource this]
    (-> this .-damageType)))

(defn *cause-indirect-magic-damage
  "source - `net.minecraft.entity.Entity`
  indirect-entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.Entity source ^net.minecraft.entity.Entity indirect-entity-in]
    (DamageSource/causeIndirectMagicDamage source indirect-entity-in)))

(defn *cause-mob-damage
  "mob - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.EntityLivingBase mob]
    (DamageSource/causeMobDamage mob)))

(defn *cause-arrow-damage
  "arrow - `net.minecraft.entity.projectile.EntityArrow`
  indirect-entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.projectile.EntityArrow arrow ^net.minecraft.entity.Entity indirect-entity-in]
    (DamageSource/causeArrowDamage arrow indirect-entity-in)))

(defn *cause-fireball-damage
  "fireball - `net.minecraft.entity.projectile.EntityFireball`
  indirect-entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.projectile.EntityFireball fireball ^net.minecraft.entity.Entity indirect-entity-in]
    (DamageSource/causeFireballDamage fireball indirect-entity-in)))

(defn *cause-thorns-damage
  "source - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.Entity source]
    (DamageSource/causeThornsDamage source)))

(defn *cause-player-damage
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.player.EntityPlayer player]
    (DamageSource/causePlayerDamage player)))

(defn *cause-thrown-damage
  "source - `net.minecraft.entity.Entity`
  indirect-entity-in - `net.minecraft.entity.Entity`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.Entity source ^net.minecraft.entity.Entity indirect-entity-in]
    (DamageSource/causeThrownDamage source indirect-entity-in)))

(defn *cause-explosion-damage
  "explosion-in - `net.minecraft.world.Explosion`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.world.Explosion explosion-in]
    (DamageSource/causeExplosionDamage explosion-in)))

(defn *cause-indirect-damage
  "source - `net.minecraft.entity.Entity`
  indirect-entity-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^net.minecraft.entity.Entity source ^net.minecraft.entity.EntityLivingBase indirect-entity-in]
    (DamageSource/causeIndirectDamage source indirect-entity-in)))

(defn unblockable?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isUnblockable))))

(defn set-projectile
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setProjectile))))

(defn get-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^DamageSource this]
    (-> this (.getEntity))))

(defn get-hunger-damage
  "returns: `float`"
  (^Float [^DamageSource this]
    (-> this (.getHungerDamage))))

(defn get-damage-location
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^DamageSource this]
    (-> this (.getDamageLocation))))

(defn get-damage-type
  "returns: `java.lang.String`"
  (^java.lang.String [^DamageSource this]
    (-> this (.getDamageType))))

(defn magic-damage?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isMagicDamage))))

(defn difficulty-scaled?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isDifficultyScaled))))

(defn set-difficulty-scaled
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setDifficultyScaled))))

(defn damage-absolute?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isDamageAbsolute))))

(defn set-damage-allowed-in-creative-mode
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setDamageAllowedInCreativeMode))))

(defn get-death-message
  "entity-living-base-in - `net.minecraft.entity.EntityLivingBase`

  returns: `net.minecraft.util.text.ITextComponent`"
  (^net.minecraft.util.text.ITextComponent [^DamageSource this ^net.minecraft.entity.EntityLivingBase entity-living-base-in]
    (-> this (.getDeathMessage entity-living-base-in))))

(defn get-source-of-damage
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^DamageSource this]
    (-> this (.getSourceOfDamage))))

(defn explosion?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isExplosion))))

(defn can-harm-in-creative?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.canHarmInCreative))))

(defn fire-damage?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isFireDamage))))

(defn set-damage-is-absolute
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setDamageIsAbsolute))))

(defn set-explosion
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setExplosion))))

(defn set-fire-damage
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setFireDamage))))

(defn set-damage-bypasses-armor
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setDamageBypassesArmor))))

(defn creative-player?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isCreativePlayer))))

(defn set-magic-damage
  "returns: `net.minecraft.util.DamageSource`"
  (^net.minecraft.util.DamageSource [^DamageSource this]
    (-> this (.setMagicDamage))))

(defn projectile?
  "returns: `boolean`"
  (^Boolean [^DamageSource this]
    (-> this (.isProjectile))))

