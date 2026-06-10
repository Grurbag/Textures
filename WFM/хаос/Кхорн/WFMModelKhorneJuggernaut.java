// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneJuggernaut extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer leg_right_front;
	private final ModelRenderer leg_right_front2;
	private final ModelRenderer leg_right_front3;
	private final ModelRenderer head;
	private final ModelRenderer neck;
	private final ModelRenderer neck2;
	private final ModelRenderer neck3;
	private final ModelRenderer horn;
	private final ModelRenderer horn2;
	private final ModelRenderer horn3;
	private final ModelRenderer leg_left_front;
	private final ModelRenderer leg_left_front2;
	private final ModelRenderer leg_left_front3;
	private final ModelRenderer leg_left_back;
	private final ModelRenderer leg_left_back2;
	private final ModelRenderer leg_left_back3;
	private final ModelRenderer leg_right_back;
	private final ModelRenderer leg_right_back2;
	private final ModelRenderer leg_right_back3;

	public WFMModelKhorneJuggernaut() {
		textureWidth = 128;
		textureHeight = 128;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 14.0F, -7.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -6.0F, -13.0F, -8.0F, 12, 15, 16, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(0.0F, 0.0F, 16.0F);
		body.addChild(body2);
		body2.cubeList.add(new ModelBox(body2, 0, 34, -5.0F, -10.0F, -8.0F, 10, 10, 12, 0.0F, false));

		leg_right_front = new ModelRenderer(this);
		leg_right_front.setRotationPoint(-7.0F, 5.0F, -7.0F);
		leg_right_front.cubeList.add(new ModelBox(leg_right_front, 70, 64, -4.0F, -5.0F, -5.0F, 5, 13, 10, 0.0F, false));

		leg_right_front2 = new ModelRenderer(this);
		leg_right_front2.setRotationPoint(0.0F, 6.0F, 1.0F);
		leg_right_front.addChild(leg_right_front2);
		setRotationAngle(leg_right_front2, 0.7854F, 0.0F, 0.0F);
		leg_right_front2.cubeList.add(new ModelBox(leg_right_front2, 71, 90, -3.0F, -2.8787F, -6.1213F, 4, 11, 7, 0.0F, false));

		leg_right_front3 = new ModelRenderer(this);
		leg_right_front3.setRotationPoint(0.0F, 5.0F, -3.0F);
		leg_right_front2.addChild(leg_right_front3);
		setRotationAngle(leg_right_front3, -1.309F, 0.0F, 0.0F);
		leg_right_front3.cubeList.add(new ModelBox(leg_right_front3, 71, 110, -2.0F, -2.0F, -2.0F, 3, 12, 6, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 11.0F, -10.0F);
		setRotationAngle(head, 0.2618F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 106, -3.5F, -7.3647F, -19.557F, 7, 10, 12, 0.0F, false));

		neck = new ModelRenderer(this);
		neck.setRotationPoint(0.0F, 4.153F, -9.6252F);
		head.addChild(neck);
		neck.cubeList.add(new ModelBox(neck, 0, 63, -5.0F, -12.0F, 2.0F, 10, 11, 4, 0.0F, false));

		neck2 = new ModelRenderer(this);
		neck2.setRotationPoint(0.0F, -6.5F, 3.0F);
		neck.addChild(neck2);
		neck2.cubeList.add(new ModelBox(neck2, 30, 66, -8.5F, -8.5F, 0.0F, 17, 17, 0, 0.0F, false));

		neck3 = new ModelRenderer(this);
		neck3.setRotationPoint(0.0F, -6.5F, 8.0F);
		neck.addChild(neck3);
		setRotationAngle(neck3, 0.0F, 3.1416F, 0.0F);
		neck3.cubeList.add(new ModelBox(neck3, 0, 63, -5.0F, -5.5F, -2.0F, 10, 11, 4, 0.0F, false));

		horn = new ModelRenderer(this);
		horn.setRotationPoint(0.0F, -7.8647F, -14.557F);
		head.addChild(horn);
		setRotationAngle(horn, 0.2182F, 0.0F, 0.0F);
		horn.cubeList.add(new ModelBox(horn, 0, 99, -0.5F, -1.5F, -2.0F, 1, 3, 4, 0.0F, false));

		horn2 = new ModelRenderer(this);
		horn2.setRotationPoint(1.0F, -3.5F, 3.0F);
		horn.addChild(horn2);
		horn2.cubeList.add(new ModelBox(horn2, 11, 94, -2.0F, 1.0F, -8.0F, 2, 1, 11, 0.0F, false));

		horn3 = new ModelRenderer(this);
		horn3.setRotationPoint(2.0F, -3.5F, 3.0F);
		horn.addChild(horn3);
		horn3.cubeList.add(new ModelBox(horn3, 0, 71, -2.0F, -4.0F, -11.0F, 0, 9, 15, 0.0F, false));

		leg_left_front = new ModelRenderer(this);
		leg_left_front.setRotationPoint(6.0F, 5.0F, -7.0F);
		leg_left_front.cubeList.add(new ModelBox(leg_left_front, 71, 0, 0.0F, -5.0F, -5.0F, 5, 13, 10, 0.0F, false));

		leg_left_front2 = new ModelRenderer(this);
		leg_left_front2.setRotationPoint(3.0F, 6.0F, 1.0F);
		leg_left_front.addChild(leg_left_front2);
		setRotationAngle(leg_left_front2, 0.7854F, 0.0F, 0.0F);
		leg_left_front2.cubeList.add(new ModelBox(leg_left_front2, 72, 26, -3.0F, -2.8787F, -6.1213F, 4, 11, 7, 0.0F, false));

		leg_left_front3 = new ModelRenderer(this);
		leg_left_front3.setRotationPoint(-1.0F, 5.0F, -3.0F);
		leg_left_front2.addChild(leg_left_front3);
		setRotationAngle(leg_left_front3, -1.3526F, 0.0F, 0.0F);
		leg_left_front3.cubeList.add(new ModelBox(leg_left_front3, 72, 46, -2.0F, -2.0F, -2.0F, 3, 12, 6, 0.0F, false));

		leg_left_back = new ModelRenderer(this);
		leg_left_back.setRotationPoint(5.0F, 10.0F, 10.0F);
		leg_left_back.cubeList.add(new ModelBox(leg_left_back, 102, 0, -1.0F, -5.0F, -4.0F, 5, 10, 8, 0.0F, false));

		leg_left_back2 = new ModelRenderer(this);
		leg_left_back2.setRotationPoint(2.0F, 6.0F, -1.0F);
		leg_left_back.addChild(leg_left_back2);
		setRotationAngle(leg_left_back2, 1.5272F, 0.0F, 0.0F);
		leg_left_back2.cubeList.add(new ModelBox(leg_left_back2, 110, 27, -3.0F, -1.8787F, -3.1213F, 4, 10, 5, 0.0F, false));

		leg_left_back3 = new ModelRenderer(this);
		leg_left_back3.setRotationPoint(-1.0F, 4.0F, -3.0F);
		leg_left_back2.addChild(leg_left_back3);
		setRotationAngle(leg_left_back3, -1.6144F, 0.0F, 0.0F);
		leg_left_back3.cubeList.add(new ModelBox(leg_left_back3, 110, 47, -2.0F, -2.0F, 0.0F, 3, 8, 4, 0.0F, false));

		leg_right_back = new ModelRenderer(this);
		leg_right_back.setRotationPoint(-5.0F, 10.0F, 10.0F);
		leg_right_back.cubeList.add(new ModelBox(leg_right_back, 102, 70, -4.0F, -5.0F, -4.0F, 5, 10, 8, 0.0F, false));

		leg_right_back2 = new ModelRenderer(this);
		leg_right_back2.setRotationPoint(0.0F, 6.0F, -1.0F);
		leg_right_back.addChild(leg_right_back2);
		setRotationAngle(leg_right_back2, 1.5272F, 0.0F, 0.0F);
		leg_right_back2.cubeList.add(new ModelBox(leg_right_back2, 110, 96, -3.0F, -1.8787F, -3.1213F, 4, 10, 5, 0.0F, false));

		leg_right_back3 = new ModelRenderer(this);
		leg_right_back3.setRotationPoint(0.0F, 4.0F, -3.0F);
		leg_right_back2.addChild(leg_right_back3);
		setRotationAngle(leg_right_back3, -1.5708F, 0.0F, 0.0F);
		leg_right_back3.cubeList.add(new ModelBox(leg_right_back3, 110, 116, -2.0F, -2.0F, 0.0F, 3, 8, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leg_right_front.render(f5);
		head.render(f5);
		leg_left_front.render(f5);
		leg_left_back.render(f5);
		leg_right_back.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}