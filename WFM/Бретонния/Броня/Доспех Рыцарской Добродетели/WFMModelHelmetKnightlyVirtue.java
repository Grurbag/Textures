// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer helmet;
	private final ModelRenderer overlay;
	private final ModelRenderer wing_left;
	private final ModelRenderer wing_right;
	private final ModelRenderer dragon;

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

		wing_left = new ModelRenderer(this);
		wing_left.setRotationPoint(-2.0F, -13.0F, 0.0F);
		helmet.addChild(wing_left);
		setRotationAngle(wing_left, 0.0F, 0.0F, -0.5236F);
		wing_left.cubeList.add(new ModelBox(wing_left, 0, 12, -0.5F, -5.0F, -2.0F, 0, 10, 10, 0.0F, false));

		wing_right = new ModelRenderer(this);
		wing_right.setRotationPoint(2.0F, -13.0F, 0.0F);
		helmet.addChild(wing_right);
		setRotationAngle(wing_right, 0.0F, 0.0F, 0.5236F);
		wing_right.cubeList.add(new ModelBox(wing_right, 0, 12, 0.5F, -5.0F, -2.0F, 0, 10, 10, 0.0F, false));

		dragon = new ModelRenderer(this);
		dragon.setRotationPoint(0.0F, -13.0F, 0.0F);
		helmet.addChild(dragon);
		dragon.cubeList.add(new ModelBox(dragon, 22, -5, 0.0F, -5.0F, -7.0F, 0, 16, 21, 0.0F, false));
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