// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMmodelHelmetOrion extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer helmetOverlay;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_right;

	public WFMmodelHelmetOrion() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		helmetOverlay = new ModelRenderer(this);
		helmetOverlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(helmetOverlay);
		helmetOverlay.cubeList.add(new ModelBox(helmetOverlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 14, 8, 0.5F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(7.0F, -11.0F, 0.0F);
		helmet.addChild(horn_left);
		setRotationAngle(horn_left, 0.0F, -0.4363F, 0.0F);
		horn_left.cubeList.add(new ModelBox(horn_left, 0, 20, -7.0F, -6.0F, 0.0F, 17, 12, 0, 0.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(-7.0F, -11.0F, 0.0F);
		helmet.addChild(horn_right);
		setRotationAngle(horn_right, 0.0F, -2.7053F, 0.0F);
		horn_right.cubeList.add(new ModelBox(horn_right, 0, 20, -7.0F, -6.0F, 0.0F, 17, 12, 0, 0.0F, false));
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