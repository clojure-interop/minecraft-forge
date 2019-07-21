(ns net.minecraftforge.common.ForgeVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeVersion]))

(defn ->forge-version
  "Constructor."
  (^ForgeVersion []
    (new ForgeVersion )))

(def *-mod-id
  "Static Constant.

  type: java.lang.String"
  ForgeVersion/MOD_ID)

(def *-major-version
  "Static Constant.

  type: int"
  ForgeVersion/majorVersion)

(def *-minor-version
  "Static Constant.

  type: int"
  ForgeVersion/minorVersion)

(def *-revision-version
  "Static Constant.

  type: int"
  ForgeVersion/revisionVersion)

(def *-build-version
  "Static Constant.

  type: int"
  ForgeVersion/buildVersion)

(def *-mc-version
  "Static Constant.

  type: java.lang.String"
  ForgeVersion/mcVersion)

(def *-mcp-version
  "Static Constant.

  type: java.lang.String"
  ForgeVersion/mcpVersion)

(defn *get-build-version
  "returns: `int`"
  (^Integer []
    (ForgeVersion/getBuildVersion )))

(defn *gather-mods
  "returns: `java.util.Map<net.minecraftforge.fml.common.ModContainer,java.net.URL>`"
  (^java.util.Map []
    (ForgeVersion/gatherMods )))

(defn *get-status
  "returns: `net.minecraftforge.common.ForgeVersion$Status`"
  (^net.minecraftforge.common.ForgeVersion$Status []
    (ForgeVersion/getStatus )))

(defn *get-minor-version
  "returns: `int`"
  (^Integer []
    (ForgeVersion/getMinorVersion )))

(defn *start-version-check
  ""
  ([]
    (ForgeVersion/startVersionCheck )))

(defn *get-version
  "returns: `java.lang.String`"
  (^java.lang.String []
    (ForgeVersion/getVersion )))

(defn *get-target
  "returns: `java.lang.String`"
  (^java.lang.String []
    (ForgeVersion/getTarget )))

(defn *get-major-version
  "returns: `int`"
  (^Integer []
    (ForgeVersion/getMajorVersion )))

(defn *get-result
  "mod - `net.minecraftforge.fml.common.ModContainer`

  returns: `net.minecraftforge.common.ForgeVersion$CheckResult`"
  (^net.minecraftforge.common.ForgeVersion$CheckResult [^net.minecraftforge.fml.common.ModContainer mod]
    (ForgeVersion/getResult mod)))

(defn *get-revision-version
  "returns: `int`"
  (^Integer []
    (ForgeVersion/getRevisionVersion )))

