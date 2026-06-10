// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer overlay;
	private final ModelRenderer horn_left;
	private final ModelRenderer horn_left2;
	private final ModelRenderer horn_left3;
	private final ModelRenderer horn_left4;
	private final ModelRenderer horn_right;
	private final ModelRenderer horn_right2;
	private final ModelRenderer horn_right3;
	private final ModelRenderer horn_right4;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		helmet = new ModelRenderer(this);
		helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.cubeList.add(new ModelBox(helmet, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		helmet.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		horn_left = new ModelRenderer(this);
		horn_left.setRotationPoint(-5.0F, -6.0F, 0.0F);
		helmet.addChild(horn_left);
		horn_left.cubeList.add(new ModelBox(horn_left, 0, 24, -1.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		horn_left2 = new ModelRenderer(this);
		horn_left2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		horn_left.addChild(horn_left2);
		setRotationAngle(horn_left2, 0.0F, 0.0F, 0.2618F);
		horn_left2.cubeList.add(new ModelBox(horn_left2, 13, 26, -2.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

		horn_left3 = new ModelRenderer(this);
		horn_left3.setRotationPoint(-1.0F, -1.0F, -1.0F);
		horn_left2.addChild(horn_left3);
		setRotationAngle(horn_left3, 0.0F, 0.0F, 0.3491F);
		horn_left3.cubeList.add(new ModelBox(horn_left3, 27, 28, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		horn_left4 = new ModelRenderer(this);
		horn_left4.setRotationPoint(0.0F, 0.0F, -1.0F);
		horn_left3.addChild(horn_left4);
		setRotationAngle(horn_left4, 0.0F, 0.0F, 0.3491F);
		horn_left4.cubeList.add(new ModelBox(horn_left4, 37, 30, -4.0F, 1.0F, 1.5F, 3, 1, 1, 0.0F, false));

		horn_right = new ModelRenderer(this);
		horn_right.setRotationPoint(5.0F, -6.0F, 0.0F);
		helmet.addChild(horn_right);
		setRotationAngle(horn_right, 0.0F, 3.1416F, 0.0F);
		horn_right.cubeList.add(new ModelBox(horn_right, 0, 24, -1.0F, -2.0F, -2.0F, 2, 4, 4, 0.0F, false));

		horn_right2 = new ModelRenderer(this);
		horn_right2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		horn_right.addChild(horn_right2);
		setRotationAngle(horn_right2, 0.0F, 0.0F, 0.2618F);
		horn_right2.cubeList.add(new ModelBox(horn_right2, 13, 26, -2.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F, false));

		horn_right3 = new ModelRenderer(this);
		horn_right3.setRotationPoint(-1.0F, -1.0F, -1.0F);
		horn_right2.addChild(horn_right3);
		setRotationAngle(horn_right3, 0.0F, 0.0F, 0.3491F);
		horn_right3.cubeList.add(new ModelBox(horn_right3, 27, 28, -2.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, false));

		horn_right4 = new ModelRenderer(this);
		horn_right4.setRotationPoint(0.0F, 0.0F, -1.0F);
		horn_right3.addChild(horn_right4);
		setRotationAngle(horn_right4, 0.0F, 0.0F, 0.3491F);
		horn_right4.cubeList.add(new ModelBox(horn_right4, 37, 30, -4.0F, 1.0F, 1.5F, 3, 1, 1, 0.0F, false));
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