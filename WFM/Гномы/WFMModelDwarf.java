// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDwarf extends ModelBase {
	private final ModelRenderer beard;
	private final ModelRenderer hand_right;
	private final ModelRenderer leg_left;
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer tits;
	private final ModelRenderer hand_left;
	private final ModelRenderer leg_right;

	public WFMModelDwarf() {
		textureWidth = 64;
		textureHeight = 64;

		beard = new ModelRenderer(this);
		beard.setRotationPoint(0.0F, 2.0F, 0.0F);
		beard.cubeList.add(new ModelBox(beard, 0, 32, -4.0F, -8.0F, -4.0F, 8, 20, 8, 1.0F, false));

		hand_right = new ModelRenderer(this);
		hand_right.setRotationPoint(-5.0F, 2.0F, 0.0F);
		hand_right.cubeList.add(new ModelBox(hand_right, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, false));

		leg_left = new ModelRenderer(this);
		leg_left.setRotationPoint(1.9F, 12.0F, 0.0F);
		leg_left.cubeList.add(new ModelBox(leg_left, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.5F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));

		tits = new ModelRenderer(this);
		tits.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.addChild(tits);
		tits.cubeList.add(new ModelBox(tits, 24, 0, -3.0F, 2.0F, -4.0F, 6, 3, 2, 0.0F, false));

		hand_left = new ModelRenderer(this);
		hand_left.setRotationPoint(5.0F, 2.0F, 0.0F);
		hand_left.cubeList.add(new ModelBox(hand_left, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.5F, true));

		leg_right = new ModelRenderer(this);
		leg_right.setRotationPoint(-1.9F, 12.0F, 0.0F);
		leg_right.cubeList.add(new ModelBox(leg_right, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		beard.render(f5);
		hand_right.render(f5);
		leg_left.render(f5);
		head.render(f5);
		body.render(f5);
		hand_left.render(f5);
		leg_right.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}