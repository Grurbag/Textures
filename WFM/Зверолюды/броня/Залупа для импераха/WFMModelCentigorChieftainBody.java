// Made with Blockbench 4.4.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer hand_right;
	private final ModelRenderer naplechnik_right;
	private final ModelRenderer shipbI_right;
	private final ModelRenderer hand_left;
	private final ModelRenderer naplechnik_left;
	private final ModelRenderer shipbI_left;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -8.0F, -8.5F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, -6.0F, -8.5F);
		hand_right.cubeList.add(new ModelBox(hand_right, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, false));

		naplechnik_right = new ModelRenderer(this);
		naplechnik_right.setRotationPoint(0.0F, -1.0F, 0.0F);
		hand_right.addChild(naplechnik_right);
		setRotationAngle(naplechnik_right, 0.0F, 0.0F, -0.3491F);
		naplechnik_right.cubeList.add(new ModelBox(naplechnik_right, 0, 0, -4.0F, -2.0F, -3.0F, 5, 4, 6, 0.0F, false));

		shipbI_right = new ModelRenderer(this);
		shipbI_right.setRotationPoint(-7.0F, -2.0F, 3.0F);
		naplechnik_right.addChild(shipbI_right);
		setRotationAngle(shipbI_right, 0.0F, 3.1416F, 0.0F);
		shipbI_right.cubeList.add(new ModelBox(shipbI_right, 46, 0, -8.0F, -7.0F, 3.0F, 9, 11, 0, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, -6.0F, -8.5F);
		hand_left.cubeList.add(new ModelBox(hand_left, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F, true));

		naplechnik_left = new ModelRenderer(this);
		naplechnik_left.setRotationPoint(3.0F, 0.0F, 0.0F);
		hand_left.addChild(naplechnik_left);
		setRotationAngle(naplechnik_left, 0.0F, 0.0F, 0.3491F);
		naplechnik_left.cubeList.add(new ModelBox(naplechnik_left, 0, 0, -4.0F, -2.0F, -3.0F, 5, 4, 6, 0.0F, false));

		shipbI_left = new ModelRenderer(this);
		shipbI_left.setRotationPoint(4.0F, -2.0F, -3.0F);
		naplechnik_left.addChild(shipbI_left);
		shipbI_left.cubeList.add(new ModelBox(shipbI_left, 46, 0, -8.0F, -7.0F, 3.0F, 9, 11, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		hand_right.render(f5);
		hand_left.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}