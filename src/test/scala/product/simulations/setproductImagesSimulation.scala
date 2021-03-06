package product.simulations

import io.gatling.core.Predef._
import utils._

/**
 * Created by os-desislava.slavova on 25/09/2015.
 */
class setproductImagesSimulation extends Simulation{
  val config = new Configurations

  val scn = scenario("Set Product Images").exec(Actions.setproductImages())

  setUp(scn.inject().protocols(config.getHttpConf))
}
