// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelCrimsonGuardHelmet extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer helmetLeft;
	private final ModelRenderer helmetRight;
	private final ModelRenderer kokoshnik;

	public WFMModelCrimsonGuardHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		helmetLeft = new ModelRenderer(this);
		helmetLeft.setRotationPoint(-4.0F, -4.0F, -3.5F);
		helmetOverlay.addChild(helmetLeft);
		setRotationAngle(helmetLeft, -0.5236F, 0.0F, 0.0F);
		helmetLeft.cubeList.add(new ModelBox(helmetLeft, 14, 16, -5.5F, -8.7321F, 0.7321F, 8, 16, 0, 0.0F, false));

		helmetRight = new ModelRenderer(this);
		helmetRight.setRotationPoint(4.0F, -4.0F, -3.5F);
		helmetOverlay.addChild(helmetRight);
		setRotationAngle(helmetRight, -0.5236F, 0.0F, 0.0F);
		helmetRight.cubeList.add(new ModelBox(helmetRight, 0, 16, -2.5F, -8.7321F, 0.7321F, 7, 16, 0, 0.0F, false));

		kokoshnik = new ModelRenderer(this);
		kokoshnik.setRotationPoint(5.0F, -9.0F, -0.5F);
		helmetOverlay.addChild(kokoshnik);
		kokoshnik.cubeList.add(new ModelBox(kokoshnik, 30, 21, -13.5F, -8.7321F, 0.7321F, 17, 11, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		helmet.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}